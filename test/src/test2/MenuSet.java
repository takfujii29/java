package test2;

import java.util.ArrayList;
import java.util.List;

public class MenuSet {
	private List<Menu> menus;

	public MenuSet(List<Menu> menus) {
		this.menus = menus;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public List<Menu> getMenusByType(String type) {
		List<Menu> menusByType = new ArrayList<>();
		for(Menu menu : this.menus) {
			if(menu.getType().equals(type)) {
				menusByType.add(menu);
			}
		}
		return menusByType;
	}

	public List<Menu> getMenusByOverCalorie(double num) {
		List<Menu> calList = new ArrayList<>();
		for(Menu menu : this.menus) {
			if(menu.getCal() > num) {
				calList.add(menu);
			}
		}
		return calList;
	}

	public List<Menu> getMenusBySpec(MenuSpec menuSpec) {
		return menus;

	}

}
