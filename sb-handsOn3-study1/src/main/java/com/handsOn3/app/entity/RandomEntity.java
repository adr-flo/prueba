package com.handsOn3.app.entity;

public class RandomEntity {
	/*
	 *  ======= Structure =======
	 *  minNumber , type Double, access modifier 'private'
	 *  maxNumber , type Double, access modifier 'private'
	 *  responseRandom , type double, access modifier 'private'
	 *  Create default constructor and constructor with parameters(double min, double max)
	 *  Create getters and setters, and toString method as well
	 * */
	
	private double minNumber;
	private double maxNumber;
	private int responseRandom;
	
	public RandomEntity(){ /* DEFAULT CONSTRUCTOR */ }
	
	/**
	 * @param min Number
	 * @param max Number
	 */
	public RandomEntity(double min, double max) {
		this.minNumber=min;
		this.maxNumber=max;
		this.responseRandom = (int) (Math.random() *(this.maxNumber-this.minNumber) + this.minNumber);
	}
	

	/**
	 * @return the minNumber
	 */
	public double getMinNumber() {
		return minNumber;
	}
	/**
	 * @param minNumber the minNumber to set
	 */
	public void setMinNumber(double minNumber) {
		this.minNumber = minNumber;
	}
	/**
	 * @return the maxNumber
	 */
	public double getMaxNumber() {
		return maxNumber;
	}
	/**
	 * @param maxNumber the maxNumber to set
	 */
	public void setMaxNumber(double maxNumber) {
		this.maxNumber = maxNumber;
	}
	/**
	 * @return the responseRandom
	 */
	public int getResponseRandom() {
		return responseRandom;
	}
	/**
	 * @param responseRandom the responseRandom to set
	 */
	public void setResponseRandom(int responseRandom) {
		this.responseRandom = responseRandom;
	}
	
	
	@Override
	public String toString() {
		return String.format("RandomEntity [minNumber=%s, maxNumber=%s, responseRandom=%s]", minNumber, maxNumber,
				responseRandom);
	}
	
	
	
	
	
}
