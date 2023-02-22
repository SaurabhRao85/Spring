package com.axis.dto;

import java.util.Date;


import java.util.Set;
import com.axis.model.User;

public class CreditCardDto {

	private long creditCardid;
	private String cardNumber;
	private String holderName;
	private String cardType;
	private Date expireDate;
	private String csv;
	private Double dailyLimit;
	private Boolean status;
	
	private Set<User> consumer;
	
	public CreditCardDto(long creditCardid, String cardNumber, String holderName, String cardType, Date expireDate,
			String csv, Double dailyLimit, Boolean status,  Set<User> consumer) {
		super();
		this.creditCardid = creditCardid;
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		this.cardType = cardType;
		this.expireDate = expireDate;
		this.csv = csv;
		this.dailyLimit = dailyLimit;
		this.status = status;
		this.consumer = consumer;
	}
	public CreditCardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCreditCardid() {
		return creditCardid;
	}
	public void setCreditCardid(long creditCardid) {
		this.creditCardid = creditCardid;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public String getCsv() {
		return csv;
	}
	public void setCsv(String csv) {
		this.csv = csv;
	}
	public Double getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(Double dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public Set<User> getConsumer() {
		return consumer;
	}
	public void setConsumer(Set<User> consumer) {
		this.consumer = consumer;
	}
	public void setUser(Set<UserDto> userDtos) {
		
		this.setUser(userDtos);
		
	}
	public Set<UserDto> getUserDto() {
		
		return getUserDto();
	}

	
	
	

	
	
	
	
	
	
	
	
}
