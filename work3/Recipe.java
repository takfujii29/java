public class Recipe {

	final private String name;
	final private int cal;

	Recipe(String name, int cal) {
		this.name = name;
		this.cal = cal;
	}
	public String getName() {
		return this.name;
	}
	public int getCal() {
		return this.cal;
	}

}
