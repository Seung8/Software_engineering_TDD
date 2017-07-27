import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCurrency {

	@Test
	public void testMultiplication1() {
		Dollar five = new Dollar(5);
		// 5의 값을 가진 Dollar 객체 생성 후 five 변수에 할당
		five.times(2);
		// five 변수 2배
		assertEquals(10, five.amount);
	}

	@Test
	public void testMultiplication2() {
		Dollar five = new Dollar(5);
		five.times(3)
		assertEquals(10, five.amount);
	}
}