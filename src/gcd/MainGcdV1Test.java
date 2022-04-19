package gcd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainGcdV1Test {
	private MainGcdV1 mainGcdV1;
	@BeforeEach
	void setUp() throws Exception {
		this.mainGcdV1 = new MainGcdV1();
	}

	@Test
	void test1() {
		assertEquals("y is zero", this.mainGcdV1.calcGcd(0, 0));
	}
	@Test
	void test2() {
		assertEquals("y is zero", this.mainGcdV1.calcGcd(1, 0));
	}
	@Test
	void test3() {
		assertEquals("x is zero", this.mainGcdV1.calcGcd(0, 1));
	}
	@Test
	void test4() {
		assertEquals("divisors are -> 1", this.mainGcdV1.calcGcd(1, 1));
	}
	@Test
	void test5() {
		assertEquals("divisors are -> 3 -> 6", this.mainGcdV1.calcGcd(6, 3));
	}
	@Test
	void test6() {
		assertEquals("not valid", this.mainGcdV1.calcGcd(-1, -1));
	}

}
