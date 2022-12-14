package com.mygdx.game.managers;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.entities.Clr;
import com.mygdx.game.entities.Fnt;
import com.mygdx.game.entities.Img;
import com.mygdx.game.entities.components.RenderComponent;
import com.mygdx.game.entities.components.TextComponent;

public class RenderManager extends Manager{

	private static SpriteBatch batch;
	
	private static ArrayList<Img> renders;
	private static ArrayList<Fnt> fonts;
	private static ArrayList<Clr> colors;
	
	public RenderManager() {
		batch = new SpriteBatch();
		load();
	}
	
	public static void render(RenderComponent r) {
		if (r.getColor() != null) {
			batch.setColor(getColor(r.getColor()));
		}
		
		batch.draw(
			getRenderByName(r.getTexName()).getTex(),
			r.getPosition().getX(),
			r.getPosition().getY(),
			r.getOrigin().getX(),
			r.getOrigin().getY(),
			r.getPosition().getWidth(),
			r.getPosition().getHeight(),
			r.getScale().getX(),
			r.getScale().getY(),
			r.getRotation(),
			(int)r.getSrc().getX(),
			(int)r.getSrc().getY(),
			(int)r.getSrc().getWidth(),
			(int)r.getSrc().getHeight(),
			r.isFlipX(),
			r.isFlipY());
		
		batch.setColor(Color.WHITE);
	}
	
	public static void render(TextComponent t) {
		BitmapFont font = getFontByName(t.getFontName()).getFont();
		
		if (t.getColor() != null) {
			font.setColor(getColor(t.getColor()));
		}
		
		font.draw(RenderManager.getBatch(), t.getText(), t.getPosition().getX(), t.getPosition().getY());
		
		font.setColor(Color.WHITE);
	}
	
	private static void load(){
		renders = new ArrayList<Img>();
		fonts = new ArrayList<Fnt>();
		colors = new ArrayList<Clr>();
		
		//Set working directory to core/assets
		FileHandle fh = Gdx.files.local("data/");
		if (!fh.isDirectory()){
			System.out.println("Error with data directory!");
		}
		loadImgs(Gdx.files.local("data/imgs/"));
		loadFonts(Gdx.files.local("data/fonts/"));
		loadColors();
	}
	
	private static void loadImgs(FileHandle fh){
		for(FileHandle f : fh.list()){
			if (!f.isDirectory()){
				if (f.name().contains("png")){
					Texture tex = new Texture(f.path());
					String filename = f.name().replace(".png", "");
					Img r = new Img(tex, filename);
					renders.add(r);
				}
			}
			else{
				loadImgs(f);
			}
		}
	}
	
	private static void loadFonts(FileHandle fh) {
		for(FileHandle f : fh.list()){
			if (!f.isDirectory()){
				if (f.name().contains("fnt")){
					String fntFile = f.path();
					String pngFile = f.path().replace(".fnt",".png");
					BitmapFont font = new BitmapFont(Gdx.files.internal(fntFile),Gdx.files.internal(pngFile), false);
					String filename = f.name().replace(".fnt", "");
					Fnt fnt = new Fnt(font, filename);
					fonts.add(fnt);
				}
			}
			else{
				loadFonts(f);
			}
		}
	}
	
	private static void loadColors() {
		colors.add(new Clr("WHITE",Color.WHITE));
		colors.add(new Clr("BLACK",Color.BLACK));
		colors.add(new Clr("RED",Color.RED));
		colors.add(new Clr("GREEN",Color.GREEN));
		colors.add(new Clr("FIREBRICK",Color.FIREBRICK));
		colors.add(new Clr("DARK_GRAY",Color.DARK_GRAY));
	}
	
	public static Color getColor(String name) {
		for(Clr c : colors) {
			if (c.getName().equals(name)) return c.getColor();
		}
		return null;
	}
	
	public static Img getRenderByName(String name) {
		for(Img r : renders) {
			if (r.getName().equals(name)) return r;
		}
		return null;
	}
	
	public static Fnt getFontByName(String name) {
		for(Fnt f : fonts) {
			if (f.getName().equals(name)) return f;
		}
		return null;
	}
	
	public static ArrayList<Img> getRenders(){
		return renders;
	}
	
	public static SpriteBatch getBatch() {
		return batch;
	}
}
