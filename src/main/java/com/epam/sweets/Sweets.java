package com.epam.sweets;

public abstract class Sweets implements Comparable<Sweets> {
	public String name;
	public float weight;
	public int price;
	public boolean sugarFree;
	

	
	public String getName() {
		return this.name;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public boolean getSugarContent() {
		return this.sugarFree;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSugarContent(boolean sugarContent) {
		this.sugarFree = sugarContent;
	}

	@Override
	public String toString() {
		String sugarFree = this.sugarFree ? "Yes" : "No";
		return "Sweets [ name = " + name + ", weight = " + weight+"gm" + ", price = Rs. " + price + ", sugarFree = " + sugarFree + " ]";
	}
	
	@Override
	public int compareTo(Sweets sweetTwo) {
		return (this.getWeight() < sweetTwo.getWeight() ? -1
                : (this.getWeight() == sweetTwo.getWeight() ? 0 : 1));
	}
}
