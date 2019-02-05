package tts24exercise2;

public class Calculator {
	
	public Calculator() {
		
	}
	
	
	public double sum(double number1, double number2) {
		return number1+number2;
		
	}

	
	//Write a sum method that takes in 2 doubles
	//And returns the sum of them

	
	//Extend the calculator and include multiplication
	//division, subtraction and squares
	//Bonus Create a magic calculator that extends Calculator
	//Add method called public double calculateSin(double value){
	
	public double sub(double number1, double number2) {
		return number1-number2;
	}
	
	public double multi(double number1, double number2) {
		return number1*number2;
	}
	
	public double divi(double number1, double number2) {
		return number1/number2;
	}
	
	public double sqr(double number1) {
		return number1*number1;
	}
	
	public double sin(double number1) {
		return Math.sin(number1);
	}
	
	public double cos(double number1) {
		return Math.cos(number1);
	}
	
	public double tan(double number1) {
		return Math.tan(number1);
	}
	
	
	
}
