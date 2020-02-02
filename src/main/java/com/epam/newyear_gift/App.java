package com.epam.newyear_gift;

import com.epam.sweets.DarkChocolate;
import com.epam.sweets.IndianSweet;
import com.epam.sweets.JellyCandy;
import com.epam.sweets.MilkChocolate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Gift gift = new Gift();
    	gift.addSweet(new DarkChocolate("Bournville", 50.75f, 100, false, 25));
    	gift.addSweet(new IndianSweet("Barfi", 100.5f, 200, true, "Odisha"));
    	gift.addSweet(new MilkChocolate("Dairy Milk Silk", 20.5f, 10, false, 12.5f));
    	gift.addSweet(new JellyCandy("Mahak", 2, 5, true));
    	gift.addSweet(new DarkChocolate("Amul dark fantasy", 40, 99, false, 12.5f));
    	
    	System.out.println("Total weight of gift = " +gift.getTotalWeight()); //Gets total weight of the gift
    	gift.openGift();
    	System.out.println("\n************************\n");
    	gift.sortGiftContent(); //sort gifts with respect to price
    	gift.openGift();  // show gifts sorted with respect to price
    	
    }
}
