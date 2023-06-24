package com.niraj.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ApplicationController {

    @GetMapping("/test")
    public String retrieveApplications(Model model){
        List<String> list = new ArrayList<>();
        model.addAttribute("applications", list);
        return "applications";
    }


    /*private ApplicationService applicationService;

    @Autowired
    public TransactionService transactionService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/applications")
    public String retrieveApplications(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/transactions")
    public String retrieveTransactions(Model model){
        model.addAttribute("transactions", transactionService.allTransaction());
        return "transactions";
    }*/
}