package com.handsOn3.app.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PowerEntity {

	private double num;
	private double pow;
	private double responseValue;
	
	public PowerEntity(){ /* DEFAULT CONSTRUCTOR */ }

	/**
	 * @param num
	 * @param pow
	 */
	public PowerEntity(double num, double pow) {
		this.num = num;
		this.pow = pow;
		this.responseValue=Math.pow(num, pow);
	}

	/**
	 * @return the num
	 */
	public double getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(double num) {
		this.num = num;
	}

	/**
	 * @return the pow
	 */
	public double getPow() {
		return pow;
	}

	/**
	 * @param pow the pow to set
	 */
	public void setPow(double pow) {
		this.pow = pow;
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
		return String.format("ResponseValue = %s",responseValue);
	}
	
	
	
	
}
