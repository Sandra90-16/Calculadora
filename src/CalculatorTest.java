import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	public final void testAdd() {
		System.out.println("add");
		 double number1 = 5.5;
		 double number2 = 3.3;
		 Calculator instance = new Calculator();
		 double expResult = 8.8;
		 double result = instance.add(number1, number2);
		 assertEquals(expResult, result); 
	}

	public final void testSubtract() {
		System.out.println("subtract");
		 double number1 = 4.1;
		 double number2 = 5.3;
		 Calculator instance = new Calculator();
		 double expResult = 5.2;
		 double result = instance.subtract(number1, number2);
		 assertEquals(expResult, result);
	}

	public final void testMultiply() {
		System.out.println("multiply");
		 double number1 = 34;
		 double number2 = 1;
		 Calculator instance = new Calculator();
		 double expResult = 34;
		 double result = instance.multiply(number1, number2);
		 assertEquals(expResult, result);
	}

	public final void testDivide() {
		System.out.println("");
		System.out.println("Division");
		 double number1 = 7.2;
		 double number2 = 4.1;
		 Calculator instance = new Calculator();
		 double expResult = 2.1;
		 double result = instance.divide(number1, number2);
		 assertEquals(expResult, result); 
	}

}
