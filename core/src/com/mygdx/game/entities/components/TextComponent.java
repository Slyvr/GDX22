package com.mygdx.game.entities.components;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.managers.RenderManager;

public class TextComponent extends Component {

	private String fontName;
	private String text;
	private PositionComponent position;
	private String color;
	
	public TextComponent() {
		this.setName("TextComponent");
		this.position = new PositionComponent();
	}
	
	public void render() {
		RenderManager.render(this);
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public PositionComponent getPosition() {
		return position;
	}

	public void setPosition(PositionComponent position) {
		this.position = position;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
