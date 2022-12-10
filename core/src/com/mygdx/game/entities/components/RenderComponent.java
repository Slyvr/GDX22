package com.mygdx.game.entities.components;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.managers.RenderManager;

public class RenderComponent extends Component{

	private Texture texture;
	private TextureRegion currentFrame;
	private TextureRegion[] regions;
	private PositionComponent position;
	private PositionComponent origin;
	private PositionComponent scale;
	private PositionComponent src;
	private float rotation;
	private boolean flipX;
	private boolean flipY;
	private Color color;
	
	public RenderComponent() {
		this.setName("RenderComponent");
	}
	
	public void render() {
		SpriteBatch batch = RenderManager.getBatch();
		if (color != null) {
			batch.setColor(color);
		}
		
		if (texture != null) {
			batch.draw(
					texture,
					position.getX(),
					position.getY(),
					origin.getX(),
					origin.getY(),
					position.getWidth(),
					position.getHeight(),
					scale.getX(),
					scale.getY(),
					rotation,
					(int)src.getX(),
					(int)src.getY(),
					(int)src.getWidth(),
					(int)src.getHeight(),
					flipX,
					flipY);
		}
		
		//Always reset color back to default
		batch.setColor(Color.WHITE);
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	public TextureRegion getCurrentFrame() {
		return currentFrame;
	}

	public void setCurrentFrame(TextureRegion currentFrame) {
		this.currentFrame = currentFrame;
	}

	public TextureRegion[] getRegions() {
		return regions;
	}

	public void setRegions(TextureRegion[] regions) {
		this.regions = regions;
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
