package com.epam.sweets;

public class MilkChocolate extends Chocolate{
	public MilkChocolate() {
		super();
	}
	
	public MilkChocolate(String name, float weight, int price, boolean sugarFree, float cocoaContent) {
		setName(name);
		setPrice(price);
		setWeight(weight);
		setSugarContent(sugarFree);
		setCocoaContent(cocoaContent);
	}
}
