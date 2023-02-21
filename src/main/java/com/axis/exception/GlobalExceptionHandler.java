package com.axis.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	 @ExceptionHandler(InValidPriceException.class)
		public ResponseEntity<ErrorInfo> handlingException(InValidPriceException exception)
		{
		    ErrorInfo errorInfo = new ErrorInfo();
		    
		    errorInfo.setErrorMessage(exception.getErrorMsg());
		    errorInfo.setHttpstatus(HttpStatus.BAD_REQUEST.toString());
		    errorInfo.setLocalDateTime(LocalDateTime.now());
		    
			return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
		}
}
