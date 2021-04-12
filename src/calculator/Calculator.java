package calculator;

public class Calculator {
	
	private double operAndOne;
	private double operAndTwo;
	private String operation;
	private double number;
	
	public Calculator() {
		this.operAndOne = 0.0;
		this.operAndTwo = 0.0;
		this.operation = "";
		this.number = 0.0;
	}
	
	public void setOperAndOne(double operAndOne) {
		this.operAndOne = operAndOne;
	}
	
	public void setOperAndTwo(double operAndTwo) {
		this.operAndTwo = operAndTwo;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public double performOperation() {
		if(operation.equals("+")) {
			number = operAndOne + operAndTwo;
		}
		if(operation.equals("-")) {
			number = operAndOne - operAndTwo;
		}
		return number;
	}
	
	public double performOperation(double operAndOne, double operAndTwo, String operation) {
		if(operation.equals("-")) {
			number = operAndOne - operAndTwo;
		}
		if(operation.equals("+")) {
			number = operAndOne + operAndTwo;
		}
		return number;
	}
	
	public void getResults() {
		System.out.println("Results: " + number);
	}
	
}

