package test;

public class Pair<F, S> {
	private F first;
	private S second;

	Pair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	public F first() {
		return this.first;
	}

	public S second() {
		return this.second;
	}

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

}
