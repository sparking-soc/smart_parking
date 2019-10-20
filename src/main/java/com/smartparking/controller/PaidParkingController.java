package com.smartparking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smartparking.model.PaidParking;
import com.smartparking.service.PaidParkingService;

public class PaidParkingController {	
	
	@Autowired PaidParking paidParking;
	@Autowired PaidParkingService paidParkingService;
	
	@RequestMapping(value = "/parking/paid", method = RequestMethod.GET)
	public PaidParking getParkingDetails() throws Exception {
		return paidParkingService.getParkingDetails();
	}

}
