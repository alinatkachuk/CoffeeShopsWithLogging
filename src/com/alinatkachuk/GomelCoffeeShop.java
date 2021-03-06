package com.alinatkachuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GomelCoffeeShop extends CoffeeShop {

	File file = new File ("GomelCoffeeShop.txt");
	
	@Override
	public void createFile() {
		while (!GomelCoffeeShop.exists()) { 
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	public void buildMessage(String coffee) {
		try {
			logger.makeLog(file, coffee);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	@Override
	public void makeLatte() {
		System.out.println ("Thanks for your order from GOMEL! Take your Latte :) Bye");
		String coffee = "Latte";
		buildMessage(coffee);
		
	}

	@Override
	public void makeCappuccino() {
		System.out.println ("Thanks for your order from GOMEL! Take your Cappuccino :) Bye");
		String coffee = "Cappuccino";
		buildMessage(coffee);
		
	}

	@Override
	public void makeAmericano() {
		System.out.println ("Thanks for your order from GOMEL! Take your Americano :) Bye");
		String coffee = "Americano";
		buildMessage(coffee);
		
	}

	@Override
	public void makeRaf() {
		System.out.println ("Thanks for your order from GOMEL! Take your Raf :) Bye");
		String coffee = "Raf";
		buildMessage(coffee);
		
	}

}
