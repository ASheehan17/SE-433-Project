import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class TestCalculator{

	double num1 =2.50;
	double num2 = 3.50;
	/*
	 * double oneDec1 =2.5; double oneDec2 = 1.3; double twoDec1= 2.55; double
	 * twoDec2 = 1.32;
	 */
	SingleOperandOperations soperand;
	double num3=25.5;
	double num4=18.5;
	
	
	@Test
	public void TestSum() {
		double sum = BasicOperations.calculate("add", num1, num2);
		assertEquals(6.0, sum);
		/*
		 * double oneDecSum = bo.calculate("add", oneDec1, oneDec2); assertEquals(3.8,
		 * oneDecSum, "The sum is incorrect"); double TwoDecSum = bo.calculate("add",
		 * twoDec1, twoDec2); assertEquals(3.87, TwoDecSum, "The sum is incorrect");
		 */
	}
	
	@Test
	public void TestMinus() {
		double minus = BasicOperations.calculate("subtract", num1, num2);
		assertEquals(-1.0, minus);
		/*
		 * double oneDecMinus = bo.calculate("subtract", oneDec1, oneDec2);
		 * assertEquals(1.2, oneDecMinus, "The sum is incorrect"); double TwoDecMinus =
		 * bo.calculate("subtract", twoDec1, twoDec2); assertEquals(1.23, TwoDecMinus,
		 * "The sum is incorrect");
		 */
	}
	
	@Test
	public void TestMultiply() {
		double multiply = BasicOperations.calculate("multiply", num1, num2);
		assertEquals(8.75, multiply);
		/*
		 * double oneDecMultiply = bo.calculate("Multiply", oneDec1, oneDec2);
		 * assertEquals(3.25, oneDecMultiply, "The sum is incorrect"); double
		 * TwoDecMultiply = bo.calculate("Multiply", twoDec1, twoDec2);
		 * assertEquals(3.366, TwoDecMultiply, "The sum is incorrect");
		 */
	
	}	
	
	@Test
	public void TestDivide() {
		double divide = BasicOperations.calculate("divide", num1, num2);
		assertEquals(0.7142857142857143, divide);
		/*double oneDecDivide = bo.calculate("divide", oneDec1, oneDec2);
		assertEquals(1.2, oneDecDivide, "The sum is incorrect");
		double TwoDecDivide = bo.calculate("subtract", twoDec1, twoDec2);
		assertEquals(1.23, TwoDecDivide, "The sum is incorrect");*/
	}	
	
	@Test
	public void TestPercentage() {
		double percent = SingleOperandOperations.calculatePercentage(num4);
		assertEquals(0.185, percent);
	}
	
	@Test
	public void TestExp() {
		double exp = SingleOperandOperations.calculateE(num3);
		assertEquals(1.1871600913216965E11, exp);
	}
	
	@Test
	public void TestSquare() {
		double square = SingleOperandOperations.calculateSquared(num4);
		assertEquals(342.25, square);
	}
	
	@Test
	public void TestSqrt() {
		double sqrt = SingleOperandOperations.calculateSqrt(num4);
		assertEquals(4.301162633521313, sqrt);
	}
		
	@Test
	public void TestCelsiustoF() {
		double celsiustoF = TemperatureOperations.CtoF(num1);
		assertEquals(36.5, celsiustoF);
	}

	@Test
	public void TestFahrenheittoC() {
		double fahrenheittoC = TemperatureOperations.FtoC(num1);
		assertEquals(-16.38888888888889, fahrenheittoC);
	}
	
	@Test
	public void TestCtoK() {
		double ctok = TemperatureOperations.CtoK(num1);
		assertEquals(275.65, ctok);
	}
	
	@Test
	public void TestLBtoKG() {
		double lbtokg = WeightConversion.LBtoKG(num3);
		assertEquals(11.566596, lbtokg);
	}
	
	@Test
	public void TestKGtoLB() {
		double kgtolb = WeightConversion.LBtoKG(num4);
		assertEquals(8.391452, kgtolb);
	}
	
	@Test
	public void TestOZtooG() {
		double oztoog = WeightConversion.OZtoG(num3);
		assertEquals(722.91225, oztoog, "The sum is incorrect");
	}
	
	@Test
	public void TestGtooZ() {
		double gtooz = WeightConversion.GtoOZ(num3);
		assertEquals(0.899487, gtooz);
	}
		
}
