package com.axis.exception;

public class InValidPriceException extends RuntimeException {
	
	String errorMsg;

	//initilze the error msg value
	public InValidPriceException(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}
	
    
	
	

}
