package gcd;

public class MainGcdV2 {
	public String calcGcd(int x, int y) {
		if (y == 0)
			return "y is zero";
		else if (x == 0)
			return "x is zero";
		else {
			String str = "divisors are";
			for (int i = 1; i <= x; i++) {//modified
				if (i % y == 0)
					str += " -> " + i;
			}
			return str;
		}
	}

}
