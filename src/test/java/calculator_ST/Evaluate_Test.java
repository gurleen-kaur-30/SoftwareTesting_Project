package calculator_ST;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;



class EvaluateTest {
	Evaluate Eval = new Evaluate();
	
	@Test
	void testEvaluate_1() {
		// 1 2 3 4 5 6 7
		String s = "";
		double result = Eval.evaluate(s);
		assertEquals(result, 0);
		
	}
	
	@Test
	void testEvaluate_2() {
		String s = "5X2+3";
		double result = Eval.evaluate(s);
		assertEquals(result, 13);
	}
	
	@Test
	void testEvaluate_3() {
		String s = "5+2X3";
		double result = Eval.evaluate(s);
		assertEquals(result, 11);
	}
	
	@Test
	void testEvaluate_4() {
		String s = "10/2+3";
		double result = Eval.evaluate(s);
		assertEquals(result, 8);
	}
	
	@Test
	void testEvaluate_5() {
		String s = "5+-";
		double result = Eval.evaluate(s);
		assertEquals(result, -5);
	}
	
	@Test
	void testEvaluate_6() {
		String s = "5-3";
		double result = Eval.evaluate(s);
		assertEquals(result, 2);
	}
	
	@Test
	void testEvaluate_7() {
		String s = "5-";
		double result = Eval.evaluate(s);
		assertEquals(result, -5);
	}
	@Test
	void testEvaluate_8() {
		String s = "10/2X5";
		double result = Eval.evaluate(s);
		assertEquals(result, 25);
	}
	@Test
	void testEvaluate_9() {
		String s = "X/5";
		double result = Eval.evaluate(s);
		assertEquals(result, 0);
	}
	@Test
	void testEvaluate_10() {
		String s = "5";
		double result = Eval.evaluate(s);
		assertEquals(result, 5);
	}
	@Test
	void testEvaluate_11() {
		String s = "178/0";
		Exception exception = assertThrows(ArithmeticException.class, () -> Eval.evaluate(s));
		assertEquals("Cannot divide by zero", exception.getMessage());
	}
	
	@Test
	void testEvaluate_12() {
		String s = "+-5";
		double result = Eval.evaluate(s);
		assertEquals(result, -5);
	}
	
	@Test
	void testEvaluate_13() {
		String s = "187.2+5";
		double result = Eval.evaluate(s);
		assertEquals(result, 192.2);
	}
	
	@Test
	void solve_1() {
		char op;
		double a, b;
		op = '+';
		a = 5;
		b = 3;
		double result = Eval.solve(op, b, a);
		assertEquals(result,8);
	}
	
	@Test
	void solve_2() {
		char op;
		double a, b;
		op = '-';
		a = 5;
		b = 3;
		double result = Eval.solve(op, b, a);
		assertEquals(result,2);
	}
	
	@Test
	void solve_3() {
		char op;
		double a, b;
		op = 'X';
		a = 5;
		b = 3;
		double result = Eval.solve(op, b, a);
		assertEquals(result,15);
	}
	
	@Test
	void solve_4() {
		char op;
		double a, b;
		op = '/';
		a = 25;
		b = 5;
		double result = Eval.solve(op, b, a);
		assertEquals(result,5);
	}
	
	@Test
	void solve_5() {
		char op;
		double a, b;
		op = '/';
		a = 25;
		b = 0;
		Exception exception = assertThrows(ArithmeticException.class, () -> Eval.solve(op,b,a));
		assertEquals("Cannot divide by zero", exception.getMessage());
	}
	
	@Test
	void random_op() {
		char op;
		double a, b;
		op = '*';
		a = 25;
		b = 0;
		double result = Eval.solve(op, b, a);
		assertEquals(result,0);
	}
	@Test
	void testHasPrecedence_1() {
		char op1,op2;
		op1 = '-';
		op2 = 'X';
		boolean result = Eval.hasPrecedence(op1, op2);
		assertEquals(result, true);
	}
	
	@Test
	void testHasPrecedence_2() {
		char op1,op2;
		op1 = 'X';
		op2 = '+';
		boolean result = Eval.hasPrecedence(op1, op2);
		assertEquals(result, false);
	}
	


}
	
