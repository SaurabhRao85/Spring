package com.axis.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCard {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "creditCard_id")
	private long creditCardid;
	private String cardNumber;
	private String holderName;
	private String cardType;
	private Date expireDate;
	private String csv;
	private Double dailyLimit;
	private Boolean status;
	
	@OneToMany(mappedBy = "creditcard",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	private Set<User> consumer;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(long creditCardid, String cardNumber, String holderName, String cardType, Date expireDate,
			String csv, Double dailyLimit, Boolean status, Set<User> consumer) {
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
	public void add(CreditCard creditCard) {
		this.add(creditCard);
		
	}
	public void setUsers(Set<User> users) {
		this.setUsers(users);
	}
	public void setCreditCard(CreditCard creditCard) {
		this.setCreditCard(creditCard);
		
	}
	
	
	
	
	
}
