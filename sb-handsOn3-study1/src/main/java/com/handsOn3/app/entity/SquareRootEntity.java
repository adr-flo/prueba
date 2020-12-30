package com.handsOn3.app.entity;

public class SquareRootEntity {
	
	private double paramValue;
	private double responseValue;
	
	public SquareRootEntity(){ /* DEFAULT CONSTRUCTOR */ }

	/**
	 * @param paramValue
	 * @param responseValue
	 */
	public SquareRootEntity(double paramValue, double responseValue) {
		super();
		this.paramValue = paramValue;
		this.responseValue = responseValue;
	}

	/**
	 * @return the paramValue
	 */
	public double getParamValue() {
		return paramValue;
	}

	/**
	 * @param paramValue the paramValue to set
	 */
	public void setParamValue(double paramValue) {
		this.paramValue = paramValue;
	}

	/**
	 * @return the responseValue
	 */
	public double getResponseValue() {
		return responseValue;
	}

	/**
	 * @param responseValue the responseValue to set
	 */
	public void setResponseValue(double responseValue) {
		this.responseValue = responseValue;
	}

	@Override
	public String toString() {
		return "SquareRootEntity [paramValue=" + paramValue + ", responseValue=" + responseValue + "]";
	}
	
	
	

}
