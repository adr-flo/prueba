package com.handsOn3.app.entity;

public class PrimeEntity {
	
	private int num;
	private boolean isPrimeOf;
	
	public PrimeEntity(){ /* DEFAULT CONSTRUCTOR */ }
	public PrimeEntity(int num) {
		this.num=num;
		this.isPrimeOf=isPrime(num);
	}
	
	
	public boolean isPrime(int num) {
		 boolean prime = true;
		    for(int i = 2; i < num; i++) {
		        if (num % i == 0) {
		            prime = false;
		            break;
		        }
		    }
		    return (prime)? true : false ;
	}
	/**
	 * @return the num1
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @return the resp
	 */
	public boolean isPrimeOf() {
		return isPrimeOf;
	}
	/**
	 * @param resp the resp to set
	 */
	public void setIsPrimeOf(boolean isPrimeOf) {
		this.isPrimeOf = isPrimeOf;
	}
	
	
	@Override
	public String toString() {
		return String.format("PrimeEntity [num1 = %s, isPrimeOf = %s]", num, isPrimeOf);
	}
	
	
	
}
