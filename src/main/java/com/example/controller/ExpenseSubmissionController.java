package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ExpenseRequestRepository;
import com.example.domain.ExpenseRequest;

@RestController
public class ExpenseSubmissionController {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private ExpenseRequestRepository expenseRequestRepository;

	@RequestMapping(value = "/expense-request/submit", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ExpenseRequest submitExpenseRequest(@RequestBody ExpenseRequest expenseRequest) {

		expenseRequestRepository.save(expenseRequest);

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("expenseRequest", expenseRequest);

		runtimeService.startProcessInstanceByKey("expenseRequestProcess", variables);

		return expenseRequest;
	}

}
