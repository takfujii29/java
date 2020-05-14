package home_work;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		//例
		Recipe r1 = new Recipe("ハンバーグ", 200);
		Recipe r2 = new Recipe("目玉焼き", 120);
		Recipe r3 = new Recipe("焼き鮭", 100);
		Recipe r4 = new Recipe("唐揚げ", 220);
		Menu menu1 = new Menu("ハンバーグ弁当", "洋食", List.of(r1, r2));
		Menu menu2 = new Menu("鮭弁当", "和食", List.of(r3, r4));

		System.out.println(r1.getName());
		System.out.println(r1.getCal());
		System.out.println(menu1.getName());
		System.out.println(menu1.getType());
		System.out.println(menu1.getCal());
		System.out.println(menu1.getRecipes().get(0).getName());

		MenuSet menuSet = new MenuSet(List.of(menu1, menu2));
		var menus = menuSet.getMenus();
	}

}