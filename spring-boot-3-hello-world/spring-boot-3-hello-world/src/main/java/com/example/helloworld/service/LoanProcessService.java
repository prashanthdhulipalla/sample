package com.example.helloworld.service;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanProcessService {

    @Autowired
    private RuntimeService runtimeService;

    public void startLoanProcess(String applicantName, int creditScore, double income) {
        VariableMap variables = Variables.createVariables()
                .putValue("applicantName", applicantName)
                .putValue("creditScore", creditScore)
                .putValue("income", income);

        runtimeService.startProcessInstanceByKey("loanProcess", variables);
    }
}
