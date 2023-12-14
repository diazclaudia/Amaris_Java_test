package com.example.dockerize.springbootapp.domain;


public class Employees {
	private String status;
	private String message;
	private Data[] data;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Data[] getData() {
		return (Data[]) data;
	}

	public void setData(Data[] data) {
		this.data = data;
	}
	
	
}
