package com.handsOn3.app.entity;

public class FibbonacciEntity {
	
	/*
	 * DEFINE NUMBER FOR ENTERED TYPE -> INTEGER
	 * RETURN A RESPONSE FROM THE METHOD FIBBONACCI
	 * */
	
	private int enteredNumber;
	private int responseNumber;
	
	
	public FibbonacciEntity(int enteredNumber) {
		this.enteredNumber=enteredNumber;
		this.responseNumber=fibbonacciNumber(enteredNumber);
	}
	
	/** @param num: will be the number to get the fibbonacci number */
	public int fibbonacciNumber(int num) {
		if (num>1){ return fibbonacciNumber(num-1) + fibbonacciNumber(num-2); } /* recursive function */
		else if (num==0){ return 0; }
		else if (num==1){ return 1; }
		else { return -1; }
	}

	/**
	 * @return the enteredNumber
	 */
	public int getEnteredNumber() {
		return enteredNumber;
	}


	/**
	 * @param enteredNumber the enteredNumber to set
	 */
	public void setEnteredNumber(int enteredNumber) {
		this.enteredNumber = enteredNumber;
	}


	/**
	 * @return the responseNumber
	 */
	public int getResponseNumber() {
		return responseNumber;
	}


	/**
	 * @param responseNumber the responseNumber to set
	 */
	public void setResponseNumber(int responseNumber) {
		this.responseNumber = responseNumber;
	}


	@Override
	public String toString() {
		return String.format("FibbonacciEntity [enteredNumber= %s, responseNumber= %s]", enteredNumber, responseNumber);
	}
	
	

}
