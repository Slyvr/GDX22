package com.mygdx.game.managers;

import java.util.ArrayList;

import com.mygdx.game.entities.components.AudioComponent;

public class AudioManager extends Manager {

	private static ArrayList<AudioComponent> audio;
	
	private AudioComponent getAudioByName(String name) {
		for (AudioComponent a : audio) {
			if (a.getName().equals(name)) return a;
		}
		return null;
	}
	
}
