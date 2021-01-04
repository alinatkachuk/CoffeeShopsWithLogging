package com.alinatkachuk;

public abstract class CoffeeShop {

	public void Wait() {
		System.out.println ("Please, wait a minute!");
	}
	
	public abstract void createFile();
	
	public abstract void makeLatte();
	
	public abstract void makeCappuccino();
	
	public abstract void makeAmericano();
	
	public abstract void makeRaf();
	
	Logger logger = new Logger();

}
