package com.niraj.app.config;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.batch.core.configuration.annotation

import com.niraj.app.service.ConverterService;
import com.niraj.app.service.ConverterServiceImpl;
import com.niraj.app.service.FileReceiverService;
import com.niraj.app.service.FileReceiverServiceImpl;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.Job;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
    /*@Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;*/

    @Bean
    @Qualifier("converterService")
    public ConverterService converterService(){
        return new ConverterServiceImpl();
    }

    @Bean
    @Qualifier("fileReceiverService")
    public FileReceiverService fileReceiverService(){
        return new FileReceiverServiceImpl();
    }


    /*@Autowired
    public FileReceiverService receiverService;

    @Autowired
    public TransactionService transactionService;

    @Autowired
    public SanctionService sanctionService;

    *//*@Autowired
    FxRateService fxRateService;*//*

    @Autowired
    AggregationService aggregationService;*/


    //File Receiver Scheduler
    /*@Bean
    @Qualifier("receiverService1")
    public FileReceiverService fileReceiverService(){
        return new FileReceiverServiceImpl();
    }
    @Bean
    public Step fileProcessScheduler(){
        return stepBuilderFactory.get("fileProcessScheduler")
                .tasklet(new FileProcessScheduler(fileReceiverService()))
                .build();
    }
    @Bean
    public Job fileJob(){
        return jobBuilderFactory.get("fileJob")
                .incrementer(new RunIdIncrementer())
                .start(fileProcessScheduler())
                //.next(sanctionProcessScheduler())
                .build();
    }*/


    //Transaction Scheduler
    /*@Bean
    @Qualifier("transactionService1")
    public TransactionService transactionService(){
        return new TransactionServiceImpl();
    }
    @Bean
    public Step transactionValidateScheduler(){
        return stepBuilderFactory.get("transactionValidateScheduler")
                .tasklet(new TransactionValidateScheduler(transactionService()))
                .build();
    }
    @Bean
    public Job transactionJob() {
        return jobBuilderFactory.get("transactionJob")
                .incrementer(new RunIdIncrementer())
                .start(transactionValidateScheduler())
                .build();
    }*/


    //Sanction Scheduler
    /*@Bean
    @Qualifier("sanctionService1")
    public SanctionService sanctionService(){
        return new SanctionServiceImpl();
    }
    @Bean
    public Step sanctionProcessScheduler(){
        return stepBuilderFactory.get("sanctionProcessScheduler")
                .tasklet(new SanctionProcessScheduler(sanctionService()))
                .build();
    }
    @Bean
    public Job sanctionJob(){
        return jobBuilderFactory.get("sanctionJob")
                .incrementer(new RunIdIncrementer())
                .start(sanctionProcessScheduler())
                .build();
    }*/


    //Aggregation Scheduler
    /*@Bean
    @Qualifier("fxRateService1")
    public FxRateService fxRateService(){
        return new FxRateServiceImpl();
    }*/
    /*@Bean
    @Qualifier("aggregationService1")
    public AggregationService aggregationService(){
        return new AggregationServiceImpl();
    }
    @Bean
    public Step aggregationScheduler(){
        return stepBuilderFactory.get("aggregationScheduler")
                .tasklet(new AggregationScheduler(aggregationService()))
                .build();
    }
    @Bean
    public Job aggregationJob(){
        return jobBuilderFactory.get("aggregationJob")
                .incrementer(new RunIdIncrementer())
                .start(aggregationScheduler())
                .build();
    }*/


    //Debit Process scheduler
    /*@Bean
    public Step debitScheduler(){
        return stepBuilderFactory.get("debitScheduler")
                .tasklet(new DebitScheduler(aggregationService()))
                .build();
    }
    @Bean
    public Job debitJob(){
        return jobBuilderFactory.get("debitJob")
                .incrementer(new RunIdIncrementer())
                .start(debitScheduler())
                .build();
    }*/



    //Credit Process scheduler
    /*@Bean
    public Step creditScheduler(){
        return stepBuilderFactory.get("creditScheduler")
                .tasklet(new CreditScheduler(aggregationService()))
                .build();
    }
    @Bean
    public Job creditJob(){
        return jobBuilderFactory.get("creditJob")
                .incrementer(new RunIdIncrementer())
                .start(creditScheduler())
                .build();
    }*/
}


