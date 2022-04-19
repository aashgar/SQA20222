package gcd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

class MainGcdV2Test {

	private MainGcdV2 mainGcdV2;
	@BeforeEach
	void setUp() throws Exception {
		this.mainGcdV2 = new MainGcdV2();
	}

	@Ignore
	void test1() {
		assertEquals("y is zero", this.mainGcdV2.calcGcd(0, 0));
	}
	@Ignore
	void test2() {
		assertEquals("y is zero", this.mainGcdV2.calcGcd(1, 0));
	}
	@Ignore
	void test3() {
		assertEquals("x is zero", this.mainGcdV2.calcGcd(0, 1));
	}
	@Test
	void test4() {
		assertEquals("divisors are -> 1", this.mainGcdV2.calcGcd(1, 1));
	}
	@Test
	void test5() {
		assertEquals("divisors are -> 3 -> 6", this.mainGcdV2.calcGcd(6, 3));
	}
	@Test
	void test6() {
		assertEquals("not valid", this.mainGcdV2.calcGcd(-1, -1));
	}


}
