package com.handsOn3.app.entity;

public class DivisionEntity {
	private double num1;
	private double num2;
	private double quotient;
	private double remainder;
	
	public DivisionEntity(){ /* DEFAULT CONSTRUCTOR */ }
	public DivisionEntity(double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
		this.quotient=(num1/num2);
		this.remainder=(num1%num2);
	}
	/**
	 * @return the num1
	 */
	public double getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public double getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	/**
	 * @return the quotient
	 */
	public double getQuotient() {
		return quotient;
	}
	/**
	 * @param quotient the quotient to set
	 */
	public void setQuotient(double quotient) {
		this.quotient = quotient;
	}
	/**
	 * @return the remainder
	 */
	public double getRemainder() {
		return remainder;
	}
	/**
	 * @param remainder the remainder to set
	 */
	public void setRemainder(double remainder) {
		this.remainder = remainder;
	}
	
	
	@Override
	public String toString() {
		return String.format("DivisionEntity [num1 = %s, num2 = %s, quotient = %s, remainder = %s]", num1, num2, quotient,
				remainder);
	}
	
	
	
	
	
}
