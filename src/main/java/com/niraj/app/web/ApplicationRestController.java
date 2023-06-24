package com.niraj.app.web;

import com.niraj.app.entity.Customer;
import com.niraj.app.service.CustomerService;
import com.niraj.app.service.FileReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/niraj")
public class ApplicationRestController {
    @Autowired
    private FileReceiverService fileReceiverService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/test1")
    public String index() {
        System.out.println("test method....");
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/customerDetails")
    public ResponseEntity<List<Customer>> customerDetails() {
        List<Customer> list = new ArrayList<>();
        try {
            System.out.println("Inside customerDetails");
            list = customerService.allCustomer();
            /*customerService.allCustomer();
            list.add("File executed Successfully");*/
            return new ResponseEntity(list, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity(list, HttpStatus.EXPECTATION_FAILED);
        }
    }



    @GetMapping("/convertFile")
    public ResponseEntity<List<String>> convertFile() {
        List<String> list = new ArrayList<>();
        try {
            fileReceiverService.readFile("convertFile");
            list.add("File executed Successfully");
            return new ResponseEntity<List<String>>(list, HttpStatus.OK);
        } catch (Exception e){
            list.add("File executed Failed");
            return new ResponseEntity<List<String>>(list, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/removeBackground")
    public ResponseEntity<List<String>> removeBackground() {
        List<String> list = new ArrayList<>();
        try {
            fileReceiverService.readFile("removeBackground");
            list.add("File executed Successfully");
            return new ResponseEntity<List<String>>(list, HttpStatus.OK);
        } catch (Exception e){
            list.add("File executed Failed");
            return new ResponseEntity<List<String>>(list, HttpStatus.EXPECTATION_FAILED);
        }
    }



    /*@Autowired
    private ApplicationService applicationService;

    *//*public void setApplicationService(ApplicationService applicationService) { this.applicationService = applicationService; }*//*

    @GetMapping("/applications1")
    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> list = applicationService.listApplications();
        return new ResponseEntity<List<Application>>(list, HttpStatus.OK);
    }*/

    /*@GetMapping("/application1/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<Application>(applicationService.findApplication(id),
                    HttpStatus.OK);
        } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }
    }

    @GetMapping("/readFileTest")
    public ResponseEntity<List<String>> readFileTest() {
        List<String> list = new ArrayList<>();
        list.add("pallavi");
        list.add("pallavi1");
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }






    //Acutal Code
    @GetMapping("/readFile")
    public ResponseEntity<List<String>> readFile() {
        List<String> list = new ArrayList<>();
        list.add("File executed Successfully");
        fileReceiverService.readFile();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/getAllBatchFiles")
    public ResponseEntity<List<BatchFile>> getAllBatchFiles() {
        System.out.print("getAllBatchFiles Started...");
        return new ResponseEntity<List<BatchFile>>(batchFileService.allBatchFiles(), HttpStatus.OK);
    }*/
}
