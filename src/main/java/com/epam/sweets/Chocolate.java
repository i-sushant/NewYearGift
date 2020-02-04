package com.epam.sweets;

public abstract class Chocolate extends Sweets{
	
	private float cocoaContent; 
	
	public Chocolate() {
		super();
	}

	public float getCocoaContent() {
		return cocoaContent;
	}

	public void setCocoaContent(float cocoaContent) {
		this.cocoaContent = cocoaContent;
	}		
}
