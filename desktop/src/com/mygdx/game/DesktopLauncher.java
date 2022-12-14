package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.GDX22;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		//config.setWindowedMode((int)(config.getDisplayMode().width/1.3f),(int)(config.getDisplayMode().height/1.3f));
		config.setWindowedMode(1280, 768);
		config.setForegroundFPS(60);
		config.setTitle("GDX22");
		new Lwjgl3Application(new GDX22(), config);
	}
}
