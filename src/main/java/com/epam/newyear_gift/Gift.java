package com.epam.newyear_gift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.sweets.Sweets;

public class Gift {
	private float weight;
	private List<Sweets> sweets = new ArrayList<>();
	public void openGift() {
		for(Sweets sweet : sweets) {
			System.out.println(sweet);
		}
	}
	
	public void addSweet(Sweets sweet) {
		sweets.add(sweet);
		this.weight = sweet.getWeight(); 
	}
	
	public void sortGiftContent() {
        Collections.sort(sweets);
        System.out.println(("Gift by sorted by price: "));
    }
	
	public float getTotalWeight() {
		return this.weight;
	}
	
}
