package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.dto.CreditCardDto;
import com.axis.service.CreditCardService;
import com.axis.utility.AppConstant;

@RestController
@RequestMapping("/api/v1")
public class CreditCardController {

	@Autowired
	private CreditCardService creditCardService;
	
	@PostMapping("/creditCards")
	public ResponseEntity<CreditCardDto> addCreditCardDetails(@RequestBody CreditCardDto creditCardDto) {
		
		return new ResponseEntity<CreditCardDto>( creditCardService.addCreditCardDetails(creditCardDto),HttpStatus.OK);
	}
	
	@GetMapping(value = "/creditCards")
	public ResponseEntity<List<CreditCardDto>> getAllCreditCardDetails() {
		
		return new ResponseEntity<List<CreditCardDto>>(creditCardService.getAllCreditCardDetails(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/creditCards/{id}")
	public ResponseEntity<CreditCardDto> getBookDetailsByBookId(@PathVariable long id) {
		
		return new ResponseEntity<CreditCardDto>(creditCardService.getCreditCardDetailsByCreditCardId(id),HttpStatus.OK);
	}
	
	@PutMapping(value = "/creditCards/{id}")
	public ResponseEntity<CreditCardDto> updateCreditCardDetailsByCreditCardID(@PathVariable long id, @RequestBody CreditCardDto creditCardDto) {
		
		return new ResponseEntity<CreditCardDto>(creditCardService.updateCreditCardDetailsByCreditCardID(id, creditCardDto),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/creditCards/{id}")
	public ResponseEntity<String> deleteCreditCardDetailsByCreditCardId(@PathVariable long id) {
		
		creditCardService.deleteCreditCardkDetailsByCreditCardId(id);
		return new ResponseEntity<String>(AppConstant.DELETE_MESSAGE, HttpStatus.OK);
	}
}
