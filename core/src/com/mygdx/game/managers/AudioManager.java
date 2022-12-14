package com.mygdx.game.managers;

import java.util.ArrayList;

import com.mygdx.game.entities.components.Audio;

public class AudioManager extends Manager {

	private static ArrayList<Audio> audio;
	
	private Audio getAudioByName(String name) {
		for (Audio a : audio) {
			if (a.getName().equals(name)) return a;
		}
		return null;
	}
	
}
