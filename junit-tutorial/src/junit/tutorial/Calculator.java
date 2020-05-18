package junit.tutorial;

public class Calculator {
	public int multiply(int x, int y) {
		return x * y;
	}
	public float divide(float x, float y) {
		if (y == 0) throw new IllegalArgumentException("divide by zero.");
		return x / y;
	}


}
