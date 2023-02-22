package com.axis.service;

import java.util.List;

import com.axis.dto.CreditCardDto;

public interface CreditCardService {

	
	public CreditCardDto addCreditCardDetails(CreditCardDto creditCardDto);
	
	public List<CreditCardDto> getAllCreditCardDetails();
	
	public CreditCardDto getCreditCardDetailsByCreditCardId(long id);

	public CreditCardDto updateCreditCardDetailsByCreditCardID(long id, CreditCardDto creditCardDto);

	public void deleteCreditCardkDetailsByCreditCardId(long id);

}
