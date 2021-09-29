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
	
	@Test
	public void testSubtract() {
		int x= 1;
		int y= 1;
		assertEquals( subtract(x, y), 0);
	}

	private Integer subtract(int x, int y) {
		return x+y;
	}
	

}
