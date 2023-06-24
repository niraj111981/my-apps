package com.niraj.app.service;

import com.niraj.app.utility.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FileReceiverServiceImpl implements FileReceiverService {

    @Autowired
    public ConverterService converterService;

    @Override
    public void readFile(String action){
        System.out.println("Starting readFile()...." + System.currentTimeMillis());

        try {
            //Read all files from inbound folder and return only filename
            Set<String> fileNames = listFiles(Constants.FOLDER_PATH + Constants.INBOUND_PATH);

            if (fileNames != null && fileNames.size() > 0) {
                System.out.print("fileNames size " + fileNames.size());
                //Iterate all file name and process the files
                for (String inputFileName : fileNames) {
                    if(Constants.ACTION_CONVERT_FILE.equalsIgnoreCase(action)) {
                        processFile(inputFileName);
                    } else if(Constants.ACTION_REMOVE_BACKGROUND.equalsIgnoreCase(action)) {
                        removeBackgroundFromImage(inputFileName);
                    }
                }
            } else {
                System.out.println("No Files available at " + System.currentTimeMillis());
            }
        } catch (Exception e){
            System.out.println("Exception in readFile()  " + e);
        }
        System.out.println("End readFile()...." + System.currentTimeMillis());
    }

    //This method is used to get the name of files under directory
    private Set<String> listFiles(String dir) {
        Set<String> fileNames = null;
        System.out.println("Inside listFiles() "+dir);
        try{
            fileNames = Stream.of(new File(dir).listFiles())
                    .filter(file -> !file.isDirectory())
                    .map(File::getName)
                    .collect(Collectors.toSet());
        }catch (Exception e){
            System.out.println("Exception in listFiles "+e);
        }
        return fileNames;
    }

    //This method is used to read file contents and convert to BathFile object
    private void processFile(String fileName){

        boolean fileConverted = converterService.convertFile(fileName, Constants.FILE_FORMAT_XPS, Constants.FILE_FORMAT_JPG);
        System.out.println("File conversion status :: " + fileConverted);
        if(fileConverted) {

            /*BatchFileXmlDO batchFileXmlDO = XmlToJavaConverter.covertToObject(FOLDER_PATH + INBOUND_PATH + fileName);

            BatchFileDO batchFile = populateBatchFileDO(batchFileXmlDO);
            batchFile.setBatchFileName(fileName);

            //Batch File Saving
            BatchFile file = batchFileService.createBatchFile(batchFile);
            if(file != null) {
                batchFile.setBatchFileId("" + file.getBatchFileId());
                //Transactions Data Saving
                transactionService.createTransaction(batchFile);
            }*/

            //Move file form inbound to outbound or outbound/failed
            //moveFile(fileName, file == null ? true: false);
            moveFile(fileName, false);
        }

        //TODO: validate Transactions

    }


    private void removeBackgroundFromImage(String fileName){

        boolean fileConverted = true;
        try {
            converterService.removeBackgroundFromImage(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File conversion status :: " + fileConverted);
        if(fileConverted) {

            moveFile(fileName, false);
        }


    }


    //This method is used to move file from inbound to outbound
    private void moveFile(String fileName, boolean isFailed){
        String pattern = "yyyyMMddhhmmssss";
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Path source = Paths.get(Constants.FOLDER_PATH + Constants.INBOUND_PATH + fileName);
            Path target = Paths.get(Constants.FOLDER_PATH + Constants.OUTBOUND_PATH + (isFailed ? Constants.FAILED_PATH :"")
                    + fileName + simpleDateFormat.format(new Date()).toString());
            Files.move(source, target);
            System.out.println("File moved to "+target.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //This method will be call as scheduler; need to create scheduler
    public void readFileScheduler(){
        String cronExpression = "0 0/5 * 1/1 * ? *";   // Call for Every 5 mins

        //readFile();
    }


}
