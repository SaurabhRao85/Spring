package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.config.TrainFeignClient;
import com.axis.dto.BookingDto;
import com.axis.dto.TrainDto;
import com.axis.exception.InValidPriceException;
import com.axis.service.BookingService;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

	@Autowired
	BookingService bookingService;
	
	@Autowired
	TrainFeignClient trainFeignClient;
	 
	@PostMapping("/book")
	public ResponseEntity<BookingDto> addBooking(@RequestBody BookingDto bookingDto)
	{
		return new ResponseEntity<BookingDto>(bookingService.addNewBooking(bookingDto), HttpStatus.OK);
	}
	
	@GetMapping("/getAlltrains")
	public ResponseEntity<List<TrainDto>> addBooking()
	{
		return new ResponseEntity<List<TrainDto>>(trainFeignClient.getAllTrains(), HttpStatus.OK);
	}
   
}
