package com.epam.sweets;

public class HardCandy extends Candy {
	public HardCandy() {
		 super();
	 }
	 
	 public HardCandy(String name, float weight, int price, boolean sugarFree) {
			setName(name);
			setPrice(price);
			setWeight(weight);
			setSugarContent(sugarFree);
			setTexture("hard");
	}
}
