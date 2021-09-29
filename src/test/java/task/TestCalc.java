package task;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCalc {

	@Test
	public void testAdd(){
		int a=2;
		int b=2;
		assertEquals( add(a, b),4);
	}

	private Integer add(int a, int b) {
		return a+b;
	}

}
