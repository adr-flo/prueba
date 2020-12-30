package com.handsOn3.app.entity;

public class EulerEntity {
	
	
	private double numberEntered;
	private double eulerResponse;
	
	
	public EulerEntity(){ /* DEFAULT CONSTRUCTOR */}
	public EulerEntity(double xEulerNumber) {
		this.numberEntered=xEulerNumber;
		this.eulerResponse=Math.exp(xEulerNumber);
	}
	
	/**
	 * @param numberEntered the numberEntered to set
	 */
	public void setEulerResponse(double xEulerNumber) {
		this.eulerResponse = Math.exp(xEulerNumber);
	}
	
	
	/**
	 * @return the eulerResponse
	 */
	public double getEulerResponse() {
		return eulerResponse;
	}
	
	
	/**
	 * @return the numberEntered
	 */
	public double getNumberEntered() {
		return numberEntered;
	}
	/**
	 * @param numberEntered the numberEntered to set
	 */
	public void setNumberEntered(double numberEntered) {
		this.numberEntered = numberEntered;
	}
	
	
	@Override
	public String toString() {
		return "EulerEntity [numberEntered=" + numberEntered + ", eulerResponse=" + eulerResponse + "]";
	}
	
	
	
	
	
	
}
