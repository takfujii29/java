package test2;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Recipe r1 = new Recipe("ハンバーグ", 200.5);
		Recipe r2 = new Recipe("サーモン", 120.0);
		Recipe r3 = new Recipe("ハンバーグ", 200.5);
		Recipe r4 = new Recipe("サーモン", 120.0);
		Recipe r5 = new Recipe("aaa", 150.0);

		System.out.println(r1.getName());
		System.out.println(r2.getCal());

		Menu menu = new Menu("ハンバーグ弁当", "洋食", List.of(r1, r2));
		System.out.println(menu.getName());
		System.out.println(menu.getType());
		System.out.println(menu.getCal());
		System.out.println(menu.getRecipes().get(0).getName());

		Menu menu1 = new Menu("ハンバーグ弁当", "洋食", List.of(r1, r2));  //r1とr2はレシピインスタンスとする
		Menu menu2 = new Menu("鮭弁当", "和食", List.of(r3, r4)); //r3とr4はレシピインスタンスとする
		Menu menu3 = new Menu("のり弁当", "和食", List.of(r4, r5)); //r4とr5はレシピインスタンスとする
		MenuSet menuSet = new MenuSet(List.of(menu1, menu2, menu3));
		var menus = menuSet.getMenus();//メニュー一覧を取得
		var getmenusByType = menuSet.getMenusByType("和食");
		var getMenusByCalorie = menuSet.getMenusByOverCalorie(200.0);
		System.out.println(menus);
		System.out.println(getmenusByType);
		System.out.println(getMenusByCalorie);
		var menus1 = menuSet.getMenusBySpec(new MenuTypeSpec("和食")); //和食のみのメニュー一覧を抽出
		var menus2 = menuSet.getMenusBySpec(new CalorieOverSpec(100));  //100カロリー以上のメニュー一覧を抽出

	}
}
