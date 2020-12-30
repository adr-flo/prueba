package com.handsOn3.app.entity;


public class BinaryEntity {
	private int numberHex;
	private double binaryNumber;
	
	public BinaryEntity(){ /* DEFAULT CONSTRUCTOR */ }
	
	/**
	 * @param numberHex : constructor receive a Integer data type
	 */
	public BinaryEntity(int numberHex) {
		this.numberHex=numberHex;
		this.binaryNumber=getBinaryNumber(numberHex);
	}
	
	public double getBinaryNumber(int num) {
		int  exp = 0, digit;
		double binary = 0;
		while(num!=0){
			digit = num % 2;           
			binary = binary + digit * Math.pow(10, exp);                                                   
            exp++;
            num = num/2;
		}
		return binary;
	}
	/**
	 * @return the numberHex
	 */
	public int getNumberHex() {
		return numberHex;
	}
	/**
	 * @param numberHex the numberHex to set
	 */
	public void setNumberHex(int numberHex) {
		this.numberHex = numberHex;
	}
	/**
	 * @return the binaryNumber
	 */
	public double getBinaryNumber() {
		return binaryNumber;
	}
	/**
	 * @param binaryNumber the binaryNumber to set
	 */
	public void setBinaryNumber(double binaryNumber) {
		this.binaryNumber = binaryNumber;
	}
	
	@Override
	public String toString() {
		return String.format("BinaryEntity [numberHex=%s, binaryNumber=%s]", numberHex, binaryNumber);
	}
	
	
}
