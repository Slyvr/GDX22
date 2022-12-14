package com.mygdx.game.entities.components;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.entities.Img;
import com.mygdx.game.managers.RenderManager;

public class RenderComponent extends Component{

	private String texName;
	private PositionComponent position;
	private PositionComponent origin;
	private PositionComponent scale;
	private PositionComponent src;
	private float rotation;
	private boolean flipX;
	private boolean flipY;
	private String color;
	
	public RenderComponent() {
		this.setName("RenderComponent");
		this.position = new PositionComponent();
		this.origin = new PositionComponent();
		this.scale = new PositionComponent();
		this.src = new PositionComponent();
	}
	
	public RenderComponent(String texName, float width, float height) {
		this.setTexName(texName);
		this.setName(texName);
		this.position = new PositionComponent();
		this.origin = new PositionComponent();
		this.scale = new PositionComponent();
		this.src = new PositionComponent();
		
		this.position.setWidth(width);
		this.position.setHeight(height);
		this.scale.setX(1);
		this.scale.setY(1);
		this.src.setWidth(width);
		this.src.setHeight(height);
	}
	
	public RenderComponent(Img img) {
		this(img.getName(),img.getTex().getWidth(),img.getTex().getHeight());
	}
	
	public void render() {
		RenderManager.render(this);
	}
	
	public String getTexName() {
		return texName;
	}
	
	public void setTexName(String texName) {
		this.texName = texName;
	}
	
	public PositionComponent getPosition() {
		return position;
	}

	public void setPosition(PositionComponent position) {
		this.position = position;
	}

	public PositionComponent getOrigin() {
		return origin;
	}

	public void setOrigin(PositionComponent origin) {
		this.origin = origin;
	}

	public PositionComponent getScale() {
		return scale;
	}

	public void setScale(PositionComponent scale) {
		this.scale = scale;
	}
	
	public void setScale(float scale) {
		this.scale.setX(scale);
		this.scale.setY(scale);
	}

	public PositionComponent getSrc() {
		return src;
	}

	public void setSrc(PositionComponent src) {
		this.src = src;
	}

	public float getRotation() {
		return rotation;
	}

	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

	public boolean isFlipX() {
		return flipX;
	}

	public void setFlipX(boolean flipX) {
		this.flipX = flipX;
	}

	public boolean isFlipY() {
		return flipY;
	}

	public void setFlipY(boolean flipY) {
		this.flipY = flipY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
