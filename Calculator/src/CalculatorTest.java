import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator cal;
	
	@Before
	public void init() {
		cal = new Calculator();
	}
	
	@Test
	public void 空文字の場合() {
		assertEquals(0, cal.add(""));
	}
	
	@Test
	public void nullの場合() {
		assertEquals(0, cal.add(null));
	}
	
	@Test
	public void 区切り文字がコンマやコロンの場合() {
		assertEquals(6, cal.add("1,2,3"));
		assertEquals(6, cal.add("1:2:3"));
		assertEquals(6, cal.add("1:2,3"));
	}
	
	@Test(expected = RuntimeException.class)
	public void 負数がある場合() {
		assertEquals(6, cal.add("1:-2,3"));
	}

	@Test
	public void カスタム区切り文字() {
		assertEquals(6, cal.add("//;¥n1;2;3"));
		assertEquals(6, cal.add("//&¥n1&2&3"));
		assertEquals(6, cal.add("//'¥n1'2'3"));
	}
}
