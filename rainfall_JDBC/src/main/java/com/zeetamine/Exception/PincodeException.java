package com.zeetamine.Exception;

public class PincodeException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	public PincodeException() {
		System.out.println("Enter Valid Pincode with 5 digits only");
		
	}

	public PincodeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public PincodeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public PincodeException(String message) {
		super(message);
		
	}

	public PincodeException(Throwable cause) {
		super(cause);
		
	}
	
	
}
