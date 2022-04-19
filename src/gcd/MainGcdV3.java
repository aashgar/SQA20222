package gcd;

public class MainGcdV3 {
	public String calcGcd(int x, int y) {
		if(x<0 || y<0) //added
			return "not valid";
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
