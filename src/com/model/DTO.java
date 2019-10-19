package com.model;

/**
 * @author Ruben Cerrato
 *
 * @param <T> Represents the specific object that is being passed in the DTO.
 */
public class DTO<T> 
{
	private int errorCode;
	private String errorMsg;
	private T data;
	
	public DTO(int errorCode, String errorMsg, T data) 
	{
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.data = data;
	}

	public int getErrorCode() { return errorCode; }
	public String getErrorMsg() { return errorMsg; }
	public T getData() { return data; }

	public void setErrorCode(int errorCode) { this.errorCode = errorCode; }
	public void setErrorMsg(String errorMsg) { this.errorMsg = errorMsg; }
	public void setData(T data) { this.data = data; }
	
	
}
