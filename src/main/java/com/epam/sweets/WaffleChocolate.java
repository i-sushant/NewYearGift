package com.epam.sweets;

public class WaffleChocolate extends Sweets {
	
	public WaffleChocolate() {
		super();
	}
	
	public WaffleChocolate(String name, float weight, int price, boolean sugarContent) {
		setName(name);
		setPrice(price);
		setWeight(weight);
		setSugarContent(sugarFree);
	}
}
