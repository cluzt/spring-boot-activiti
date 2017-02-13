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

import com.example.dao.LeaveRequestRepository;
import com.example.domain.LeaveRequest;

@RestController
public class LeaveSubmissionController {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private LeaveRequestRepository leaveRequestRepository;

	@RequestMapping(value = "/submit-leave-request", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody LeaveRequest submitLeaveRequest(@RequestBody LeaveRequest leaveRequest) {

		leaveRequestRepository.save(leaveRequest);

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("leaveRequest", leaveRequest);

		runtimeService.startProcessInstanceByKey("leaveRequestProcess", variables);

		return leaveRequest;
	}

}
