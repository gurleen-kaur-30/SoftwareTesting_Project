package calculator_ST;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EvaluateTest {
	@Test
	void testEvaluate_1() {
		// 1 2 3 4 5 6 7
		String s = "";
		double result = Evaluate.evaluate(s);
		assertEquals(result, 0);
		
	}
}
	