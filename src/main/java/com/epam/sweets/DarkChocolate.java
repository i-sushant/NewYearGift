package com.epam.sweets;

public class DarkChocolate extends Chocolate {
	public DarkChocolate() {
		super();
	}
	
	public DarkChocolate(String name, float weight, int price, boolean sugarFree,float cocoaContent) {
		setName(name);
		setPrice(price);
		setWeight(weight);
		setSugarContent(sugarFree);
		setCocoaContent(cocoaContent);
	}
}
