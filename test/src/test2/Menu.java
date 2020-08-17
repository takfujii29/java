package test2;

import java.util.List;

public class Menu {
	private String name;
	private String type;
	private List<Recipe> recipes;

	public Menu(String name, String type, List<Recipe> recipes) {
		this.name = name;
		this.type = type;
		this.recipes = recipes;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public double getCal() {
		int sum = 0;
		int size = this.recipes.size();
		for(int i = 0; i < size; i++) {
			sum += this.recipes.get(i).getCal();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", type=" + type + "]";
	}
}


