package com.mygdx.game.game;

public class SantaGameInstance extends GameInstance {

	private long timeGrindWasPushed;
	private long timeoutGrind;
	private boolean grinding;
	private float xmasCheer;
	private float xmasCheerScale;
	private int grindLevel;
	
	public SantaGameInstance() {
		super();
		timeoutGrind = 3000;
		grinding = false;
		xmasCheerScale = 0.001f;
		timeGrindWasPushed = 0;
	}
	
	public void render() {
		super.render();
	}
	
	public void update() {
		super.update();
		if (System.currentTimeMillis() >= (timeGrindWasPushed+timeoutGrind)) {
			grindOff();
		}
		else {
			grind();
		}
		
		setGrindLevel();
	}
	
	private void grind() {
		grinding = true;
		xmasCheer+=xmasCheerScale;
		xmasCheerScale += 0.001f;
	}
	
	private void grindOff() {
		grinding = false;
		if (xmasCheer > 0) xmasCheer-=xmasCheerScale;
		if (xmasCheer <= 0) {
			xmasCheer = 0;
			xmasCheerScale = 0.001f;
		}
		xmasCheerScale += 0.01f;
	}
	
	private void setGrindLevel() {
		if (!(xmasCheer > 100)) {
			grindLevel = 1;
		}
		else if (!(xmasCheer > 200)) {
			grindLevel = 2;
		}
		else if (!(xmasCheer > 500)) {
			grindLevel = 3;
		}
		else if (!(xmasCheer > 1000)) {
			grindLevel = 4;
		}
		else if (!(xmasCheer > 2000)) {
			grindLevel = 5;
		}
		else if (!(xmasCheer > 5000)) {
			grindLevel = 6;
		}
		
		System.out.println(grindLevel);
	}

	public long getTimeGrindWasPushed() {
		return timeGrindWasPushed;
	}

	public void setTimeGrindWasPushed(long timeGrindWasPushed) {
		this.timeGrindWasPushed = timeGrindWasPushed;
	}

	public long getTimeoutGrind() {
		return timeoutGrind;
	}

	public void setTimeoutGrind(long timeoutGrind) {
		this.timeoutGrind = timeoutGrind;
	}

	public boolean isGrinding() {
		return grinding;
	}

	public float getXmasCheer() {
		return xmasCheer;
	}

	public float getXmasCheerScale() {
		return xmasCheerScale;
	}

	public int getGrindLevel() {
		return grindLevel;
	}

}
