package gcd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainGcdV3Test {

	private MainGcdV3 mainGcdV3;
	@BeforeEach
	void setUp() throws Exception {
		this.mainGcdV3 = new MainGcdV3();
	}

	@Test
	void test1() {
		assertEquals("y is zero", this.mainGcdV3.calcGcd(0, 0));
	}
	@Test
	void test2() {
		assertEquals("y is zero", this.mainGcdV3.calcGcd(1, 0));
	}
	@Test
	void test3() {
		assertEquals("x is zero", this.mainGcdV3.calcGcd(0, 1));
	}
	@Test
	void test4() {
		assertEquals("divisors are -> 1", this.mainGcdV3.calcGcd(1, 1));
	}
	@Test
	void test5() {
		assertEquals("divisors are -> 3 -> 6", this.mainGcdV3.calcGcd(6, 3));
	}
	@Test
	void test6() {
		assertEquals("not valid", this.mainGcdV3.calcGcd(-1, -1));
	}

}
