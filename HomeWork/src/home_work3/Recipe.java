package home_work3;

public class Recipe {

	final private String name;
	final private double cal;

	Recipe(String name, double cal) {
		this.name = name;
		this.cal = cal;
	}
	public String getName() {
		return this.name;
	}
	public double getCal() {
		return this.cal;
	}

}