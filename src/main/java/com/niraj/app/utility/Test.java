package com.niraj.app.utility;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String args[]){



        /*String pattern = "yyyyMMddhhmmss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        System.out.println("date :: "+date.toString());

        BatchFileDO batchFileDO = new BatchFileDO();
        System.out.println("Start ::: Size "+batchFileDO.getAggregationDOs().size());
        Aggregation aggregation = new Aggregation();
        List<Aggregation> aggregationList =  batchFileDO.getAggregationDOs();
        aggregationList.add(aggregation);
        batchFileDO.setAggregationDOs(aggregationList);

        System.out.println("End ::: Size "+batchFileDO.getAggregationDOs().size());

        Aggregation aggregation1 = new Aggregation();
        aggregationList =  batchFileDO.getAggregationDOs();
        aggregationList.add(aggregation1);
        batchFileDO.setAggregationDOs(aggregationList);

        System.out.println("End1111 ::: Size "+batchFileDO.getAggregationDOs().size());*/

        /*List<TransactionVer> transactionVers = new ArrayList<TransactionVer>();
        TransactionVer transactionVer = new TransactionVer();
        transactionVer.setTransactionId("1");
        transactionVer.setTransactionVerNo(1);
        transactionVers.add(transactionVer);

        transactionVer = new TransactionVer();
        transactionVer.setTransactionId("1");
        transactionVer.setTransactionVerNo(2);
        transactionVers.add(transactionVer);


        long transactionVerNo = transactionVers
                .stream()
                .filter(txnVer -> "1".equalsIgnoreCase(txnVer.getTransactionId()))
                .count();
        System.out.println(transactionVerNo);*/


    }
}
