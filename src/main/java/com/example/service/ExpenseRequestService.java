package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class ExpenseRequestService {

	public void approveRequest() {
		System.out.println("Approving request ...");
	}

	public void rejectRequest() {
		System.out.println("Rejecting request ...");
	}

}
