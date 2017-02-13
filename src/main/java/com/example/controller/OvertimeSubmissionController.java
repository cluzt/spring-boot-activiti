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

import com.example.dao.OvertimeRequestRepository;
import com.example.domain.OvertimeRequest;

@RestController
public class OvertimeSubmissionController {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private OvertimeRequestRepository overtimeRequestRepository;

	@RequestMapping(value = "/overtime-request/submit", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody OvertimeRequest submitOvertimeRequest(@RequestBody OvertimeRequest overtimeRequest) {

		overtimeRequestRepository.save(overtimeRequest);

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("overtimeRequest", overtimeRequest);

		runtimeService.startProcessInstanceByKey("overtimeRequestProcess", variables);

		return overtimeRequest;
	}

}
