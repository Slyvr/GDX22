package com.mygdx.game.entities.components;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.managers.RenderManager;

public class TextComponent extends Component {

	private BitmapFont font;
	private String text;
	private PositionComponent position;
	
	public TextComponent() {
		this.setName("TextComponent");
	}
	
	public void render() {
		font.draw(RenderManager.getBatch(), text, position.getX(), position.getY());
	}
	
}
