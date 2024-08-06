package com.example.helloworld.controller;

import com.example.helloworld.service.LoanProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanProcessController {

    @Autowired
    private LoanProcessService loanProcessService;

    @GetMapping("/startLoanProcess")
    public String startLoanProcess(@RequestParam String applicantName,
                                   @RequestParam int creditScore,
                                   @RequestParam double income) {
        loanProcessService.startLoanProcess(applicantName, creditScore, income);
        return "Loan process started for applicant: " + applicantName;
    }
}
