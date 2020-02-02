package com.epam.sweets;

public class IndianSweet extends Sweets {

	public String originRegion;
	
	public IndianSweet() {
		super();
	}

	public IndianSweet(String name, float weight, int price, boolean sugarFree, String originRegion) {
		setName(name);
		setPrice(price);
		setWeight(weight);
		setSugarContent(sugarFree);
		this.originRegion = originRegion;
	}
	
}
