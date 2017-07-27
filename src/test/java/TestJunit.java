import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		// String 타입의 str 변수 선언
		assertEquals("Junit is working fine", str);
		// 같은지 확인한다 ("Junit is workung fine"이 변수 str과 같은지)
	}
}