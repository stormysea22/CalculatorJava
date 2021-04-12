import calculator.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.setOperAndOne(3.0);
		c.setOperAndTwo(2.0);
		c.setOperation("+");
		c.performOperation();
		c.getResults();
		
		Calculator c2 = new Calculator();
		c2.performOperation(9.0, 8.0, "-");
		c2.getResults();
		}

}
