package com.axis.exception;

import java.time.LocalDateTime;

public class ErrorInfo {

 private String errorMessage;
 private String httpstatus;
 private LocalDateTime localDateTime;
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public String getHttpstatus() {
	return httpstatus;
}
public void setHttpstatus(String httpstatus) {
	this.httpstatus = httpstatus;
}
public LocalDateTime getLocalDateTime() {
	return localDateTime;
}
public void setLocalDateTime(LocalDateTime localDateTime) {
	this.localDateTime = localDateTime;
}
 
 
 
	
	
}
