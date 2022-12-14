package com.mygdx.game.managers;

import java.util.ArrayList;

import com.mygdx.game.menus.MainMenu;
import com.mygdx.game.menus.Menu;

public class MenuManager extends Manager {

	public static Menu currentMenu;
	public static ArrayList<Menu> menus;

	public MenuManager() {
		load();
	}
	
	public static void load() {
		menus = new ArrayList<Menu>();
		
		menus.add(new MainMenu());
		
		currentMenu = menus.get(0);
	}
	
	public static Menu getCurrentMenu() {
		return currentMenu;
	}

	public static void setCurrentMenu(Menu currentMenu) {
		MenuManager.currentMenu = currentMenu;
	}
	
	
}
