package test2;

public class Recipe {

	private String name;
	private Double cal;

	Recipe(String name, Double cal) {
		this.name = name;
		this.cal = cal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCal() {
		return cal;
	}

	public void setCal(Double cal) {
		this.cal = cal;
	}
}
