package com.samples.designpatterns;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		Calculator calc1 = new Calculator(new Addition());
		System.out.println("10 + 5 = " + calc1.calculate(10, 5));
		
		Calculator calc2 = new Calculator(new Subtraction());
		System.out.println("10 - 5 = " + calc2.calculate(10, 5));
		
		Calculator calc3 = new Calculator(new Multiplication());
		System.out.println("10 * 5 = " + calc3.calculate(10, 5));
		
	}
	
}

/*
 * implementing strategy pattern
 */
class Calculator {
	private CalculationStrategy calcStrategy;
	
	public Calculator(CalculationStrategy calcStrategy) {
		this.calcStrategy = calcStrategy;
	}
	
	public int calculate(int num1, int num2) {
		return calcStrategy.doCalc(num1, num2);
	}
}

interface CalculationStrategy {
	public int doCalc(int num1, int num2);
}

class Addition implements CalculationStrategy {
	@Override
	public int doCalc(int num1, int num2) {
		return num1 + num2;
	}
}

class Subtraction implements CalculationStrategy {
	@Override
	public int doCalc(int num1, int num2) {
		return num1 - num2;
	}
}

class Multiplication implements CalculationStrategy {
	@Override
	public int doCalc(int num1, int num2) {
		return num1 * num2;
	}
}