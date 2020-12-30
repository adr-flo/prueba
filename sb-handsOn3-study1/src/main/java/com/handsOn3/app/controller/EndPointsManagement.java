package com.handsOn3.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.handsOn3.app.entity.BinaryEntity;
import com.handsOn3.app.entity.DivisionEntity;
import com.handsOn3.app.entity.EulerEntity;
import com.handsOn3.app.entity.FibbonacciEntity;
import com.handsOn3.app.entity.PowerEntity;
import com.handsOn3.app.entity.PrimeEntity;
import com.handsOn3.app.entity.RandomEntity;
import com.handsOn3.app.entity.SquareRootEntity;

@RestController
public class EndPointsManagement {
	
	
	
	
	/* ===== Square Root OPERATION ===== */
	/* put the URI -> http://localhost:8080/math-api/operations/squareRoot/4 */
	
	@GetMapping(path = "/math-api/operations/squareRoot/{number}", produces = MediaType.APPLICATION_JSON_VALUE)
	public  SquareRootEntity getSquareRootService(@PathVariable double number) {
		double res=Math.sqrt(number);
		return new SquareRootEntity(number, res);
	}
	
	/* ===== Power OPERATION ===== */
	/* put the URI -> http://localhost:8080/math-api/operations/power?num1=3&num2=2*/
	
	@GetMapping( path = "/math-api/operations/power", produces = {MediaType.APPLICATION_XML_VALUE })
	public PowerEntity getPowerService(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
		return new PowerEntity(num1, num2);
	}
	
	/* ===== Euler Root OPERATION ===== */
	/* put the URI -> http://localhost:8080/math-api/operations/euler/xNumber */
	
	@GetMapping(path = "/math-api/operations/euler/{x}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EulerEntity getEulerNumberService(@PathVariable double x) {
		return new EulerEntity(x);
	}
	
	
	/* ===== Fibbonacci OPERATION ===== */
	/* put the URI -> http://localhost:8080/math-api/operations/fibbonacci/xNumber */
	
	@GetMapping(value = "/math-api/operations/fibbonacci/{num}", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
	public String getFibonnaciNumber(@PathVariable int num) {
		FibbonacciEntity fEntity = new FibbonacciEntity(num);
		String html = 
				"<html>\n"+ 
			    "<header>"+ 
					"<title>Fibbonacci Number</title>"+
			    "</header>\n"+
				"<body>\n"+ 
			    	"<h2> The Fibbonacci Number is -> "+fEntity.getResponseNumber()+"</h2> \n"+
			    "</body>\n"+ 
			    "</html>";
		return html;
	}
	
	
	/* ===== Random Number OPERATION ===== */
	/* put the URI -> http://localhost:8080/math-api/operations/random/?min=minNumber&max=maxNumber */
	
	@GetMapping(path = "/math-api/operations/random", produces = MediaType.APPLICATION_JSON_VALUE)
	public RandomEntity getRandomNumber(@RequestParam double min,@RequestParam double max) {
		return new RandomEntity(min, max);
	}
	
	
	/* ===== Prime Number OPERATION ===== */
	/* put the URI -> http://localhost:8080/math-api/operations/prime/xNumber */
	
	@GetMapping(path = "/math-api/operations/prime/{num}", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String  getIsPrime(@PathVariable int num) {
		PrimeEntity prime = new PrimeEntity(num);
		if(prime.isPrimeOf()) {
			return "The number "+num+" is prime -> "+prime.isPrime(num)+"\n"+prime.toString();
		}else {
			return "The number "+num+" isn´t prime -> "+prime.isPrime(num)+"\n"+prime.toString();
		}
	}
	
	
	/* ===== Division OPERATION ===== */
	/* put the URI -> http://localhost:8080/math-api/operations/division/?num1=num1&num2=num2 */
	
	@GetMapping(path = "/math-api/operations/division", produces = MediaType.APPLICATION_JSON_VALUE)
	public DivisionEntity getDivisionOperation(@RequestParam double num1, @RequestParam double num2) {
		return new DivisionEntity(num1, num2);
	}
	
	/* ===== Binary OPERATION ===== */
	/* put the URI -> http://localhost:8080/math-api/operations/binary?numHex=value */
	
	@GetMapping(path = "/math-api/operations/binary", produces = MediaType.APPLICATION_XML_VALUE)
	public BinaryEntity getBinaryNumber(@RequestParam("numHex") int numHex) {
		return new BinaryEntity(numHex);
	}
	
	
	
	
	
	

}
