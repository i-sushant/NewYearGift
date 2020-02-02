package com.epam.sweets;

public class JellyCandy extends Candy {
	 public JellyCandy() {
		 super();
	 }
	 
	 public JellyCandy(String name, float weight, int price, boolean sugarFree) {
			setName(name);
			setPrice(price);
			setWeight(weight);
			setSugarContent(sugarFree);
			setTexture("jelly");
	}
}
