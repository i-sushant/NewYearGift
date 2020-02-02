package com.epam.sweets;

public abstract class Candy extends Sweets {
	
	public String texture;
	
	public Candy() {
		super();
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}
	
	
}
