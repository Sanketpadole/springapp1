//package com.hello.springapp.exception;
//
//public class ResourceNotFoundException extends RuntimeException{
//	
//	
//	private static final long SerialVersionUID=1L;
//	
//	private String resourceName;
//	private String fieldName;
//	private String fieldValue;
//	
//	public ResourceNotFoundException(String resourceName,String fieldName,String fieldValue) {
//		super(String.format("%s notfound with %s:'%s'", resourceName,fieldName,fieldValue));
//		this.resourceName=resourceName;
//		this.fieldName=fieldName;
//		this.fieldValue=fieldValue;
//	}
//	public String getResourceName() {
//		return resourceName;
//		
//	}
//	public String getFieldName() {
//		return fieldName;
//	}
//	public String getFieldValue() {
//		return fieldValue;
//	}
//	
//	
//
//}
