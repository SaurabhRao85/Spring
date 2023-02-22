package com.axis.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "user10")
public class User {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;
	private String phoneNumber;
	private String password;
	private String role;
	private LocalDate date;
	private Integer status;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<CreditCard> creditCards;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id, String phoneNumber, String password, String role, LocalDate date, Integer status) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.role = role;
		this.date = date;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.setCreditCard(creditCard);
		
	}
	
	
	
	
}


