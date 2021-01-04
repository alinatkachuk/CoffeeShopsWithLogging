package com.alinatkachuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoToDrinkCoffee {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		CoffeeShop coffeeshop;
		Biscuits biscuits;
		
		String town; 
		String typeOfCoffee;
				
		do {
		    do {
		    	System.out.print("What city would you like to visit a coffee shop? "
		    			+ "\n" + "    |1.Minsk 2.Vitebsk 3.Grodno 4.Mogilev 5.Brest 6.Gomel|"
		    			+ "\n" + "Please choose a number: ");
		    	town = reader.readLine();
		    } while (Integer.parseInt(town)<=0);
		} while (Integer.parseInt(town)>6);   
		
		System.out.println();
		
		do {
		    do {
		    	System.out.print("What kind of coffee do you want?"
		    			+ "\n" + "    |1.Latte 2.Cappuccino 3.Americano 4.Raf|"
		    			+ "\n" + "Please choose a number: ");
		    	typeOfCoffee = reader.readLine();
		    } while (Integer.parseInt(typeOfCoffee)<=0);
		} while (Integer.parseInt(typeOfCoffee)>4);   
				
		System.out.println();
		
		switch (Integer.parseInt(town)) {
        case 1:
        	biscuits = new MinskCoffeeShop();
        	biscuits.sellBiscuits();
        	break;
        case 2:
        	biscuits = new VitebskCoffeeShop();
        	biscuits.sellBiscuits();
        	break;
		}
		
		System.out.println();
		
		coffeeshop = new MinskCoffeeShop();
		coffeeshop.Wait();
		switch (Integer.parseInt(town)) {
        case 1:
        	coffeeshop = new MinskCoffeeShop();
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		coffeeshop.makeLatte();
        		break;
        	case 2:
        		coffeeshop.makeCappuccino();
        		break;	
        	case 3:
        		coffeeshop.makeAmericano();
        		break;
        	case 4:
        		coffeeshop.makeRaf();
        		break;	
         	}
        	break;
        case 2:
        	coffeeshop = new VitebskCoffeeShop();
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		coffeeshop.makeLatte();
        		break;
        	case 2:
        		coffeeshop.makeCappuccino();
        		break;	
        	case 3:
        		coffeeshop.makeAmericano();
        		break;
        	case 4:
        		coffeeshop.makeRaf();
        		break;	
         	}
        	break;
        case 3:
        	coffeeshop = new GrodnoCoffeeShop();
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		coffeeshop.makeLatte();
        		break;
        	case 2:
        		coffeeshop.makeCappuccino();
        		break;	
        	case 3:
        		coffeeshop.makeAmericano();
        		break;
        	case 4:
        		coffeeshop.makeRaf();
        		break;	
         	}
        	break;
        case 4:
        	coffeeshop = new MogilevCoffeeShop();
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		coffeeshop.makeLatte();
        		break;
        	case 2:
        		coffeeshop.makeCappuccino();
        		break;	
        	case 3:
        		coffeeshop.makeAmericano();
        		break;
        	case 4:
        		coffeeshop.makeRaf();
        		break;	
         	}
        	break;
        case 5:
        	coffeeshop = new BrestCoffeeShop();
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		coffeeshop.makeLatte();
        		break;
        	case 2:
        		coffeeshop.makeCappuccino();
        		break;	
        	case 3:
        		coffeeshop.makeAmericano();
        		break;
        	case 4:
        		coffeeshop.makeRaf();
        		break;	
         	}
        	break;
        case 6:
        	coffeeshop = new GomelCoffeeShop();
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		coffeeshop.makeLatte();
        		break;
        	case 2:
        		coffeeshop.makeCappuccino();
        		break;	
        	case 3:
        		coffeeshop.makeAmericano();
        		break;
        	case 4:
        		coffeeshop.makeRaf();
        		break;	
         	}
        	break;
		}

	}

}

