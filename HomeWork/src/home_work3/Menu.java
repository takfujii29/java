package home_work3;

import java.util.Collections;
import java.util.List;

public class Menu {

  final private String name;
  final private String type;
  final private List<Recipe> recipes;

	public Menu(String name, String type, List<Recipe> recipes) {
    this.name = name;
    this.type = type;
    this.recipes = Collections.unmodifiableList(recipes);
	}

	public String getName() {
		return this.name;
  }

  public String getType() {
    return this.type;
  }

  public List<Recipe> getRecipes() {
    return this.recipes;
  }

  public int getCal() {
    int sum = 0;
    int size = this.recipes.size();
    for (int i = 0; i < size; i++) {
      sum += this.recipes.get(i).getCal();
    }
    return sum;
  }


}
