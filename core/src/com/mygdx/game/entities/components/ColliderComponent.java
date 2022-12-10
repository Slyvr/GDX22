package com.mygdx.game.entities.components;

import com.badlogic.gdx.math.Rectangle;

public class ColliderComponent extends Component {

	private Rectangle collisionBox;
	
	private PositionComponent entityPosition;
	
	public ColliderComponent() {
		this.setName("ColliderComponent");
	}
	
	public boolean isCollision(Rectangle collider) {
		collisionBox.x = entityPosition.getX();
		collisionBox.y = entityPosition.getY();
		if (collider.overlaps(collisionBox)) {
			return true;
		}
		return false;
	}
}
