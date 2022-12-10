package com.mygdx.game.managers;

import com.mygdx.game.menus.Menu;

public class MenuManager extends Manager {

	public static Menu currentMenu;

	public static Menu getCurrentMenu() {
		return currentMenu;
	}

	public static void setCurrentMenu(Menu currentMenu) {
		MenuManager.currentMenu = currentMenu;
	}
	
	
}
