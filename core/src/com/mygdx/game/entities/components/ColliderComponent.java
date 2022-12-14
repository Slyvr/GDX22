package com.mygdx.game.entities.components;

import com.badlogic.gdx.math.Rectangle;

public class ColliderComponent extends Component {

	private Rectangle collisionBox;
	
	private PositionComponent entityPosition;
	
	public ColliderComponent() {
		this.setName("ColliderComponent");
	}
	
	public ColliderComponent(PositionComponent entityPosition, Rectangle collisionBox, Rectangle scale) {
		this.entityPosition = entityPosition;
		this.collisionBox = collisionBox;
		this.collisionBox.width = this.collisionBox.width*scale.x;
		this.collisionBox.height = this.collisionBox.height*scale.y;
	}
	
	public boolean isCollision(Rectangle collider) {
		collisionBox.x = entityPosition.getX();
		collisionBox.y = entityPosition.getY();
		if (collider.overlaps(collisionBox)) {
			return true;
		}
		return false;
	}

	public Rectangle getCollisionBox() {
		return collisionBox;
	}

	public void setCollisionBox(Rectangle collisionBox) {
		this.collisionBox = collisionBox;
	}

	public PositionComponent getEntityPosition() {
		return entityPosition;
	}

	public void setEntityPosition(PositionComponent entityPosition) {
		this.entityPosition = entityPosition;
	}
	
}
