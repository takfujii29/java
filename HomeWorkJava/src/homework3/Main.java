package homework3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    Recipe r1 = new Recipe("ハンバーグ", 200.5);
    Recipe r2 = new Recipe("目玉焼き", 120);
    Recipe r3 = new  Recipe("唐揚げ", 250);
    Recipe r4 = new Recipe("焼き鮭", 150);
    Recipe r5 = new Recipe("白身魚フライ", 200);

    Menu menu1 = new Menu("ハンバーグ弁当", "洋食", List.of(r1, r2));
    Menu menu2 = new Menu("鮭弁当", "和食", List.of(r3, r4)); //r3とr4はレシピインスタンスとする
    Menu menu3 = new Menu("のり弁当", "和食", List.of(r4, r5)); //r4とr5はレシピインスタンスとする
    System.out.println(menu1.getName()); //ハンバーグ弁当
    System.out.println(menu1.getType()); //洋食
    System.out.println(menu1.getCal()); //320.5
    System.out.println(menu1.getRecipes().get(0).getName()); //ハンバーグ
    
    MenuSet menuSet = new MenuSet(List.of(menu1, menu2, menu3));
    var menus = menuSet.getMenus(); //メニュー一覧を取得
    var menusType = menuSet.getMenusByType("和食"); //menusは、menu2とmenu3のみのリスト
    var menusCal = menuSet.getMenusByOverCalorie(100);
    var menus1 = menuSet.getMenusBySpec(new MenuTypeSpec("和食")); //和食のみのメニュー一覧を抽出
    var menus2 = menuSet.getMenusBySpec(new CalorieOverSpec(100));  //100カロリー以上のメニュー一覧を抽出
    System.out.println(menus);
    System.out.println(menusType);
    System.out.println(menusCal);
    System.out.println(menus1);
    System.out.println(menus2);
  }
}
