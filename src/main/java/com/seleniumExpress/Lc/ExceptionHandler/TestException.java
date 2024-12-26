package com.seleniumExpress.Lc.ExceptionHandler;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TestException {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String nullPointerException()
	{
		return "Exception";
	}
	
	@ExceptionHandler(value = IOException.class)
	public String ioException()
	{
		return "Exception";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String Exception()
	{
		return "Exception";
	}

}
