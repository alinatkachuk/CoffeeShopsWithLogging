package com.alinatkachuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Biscuits {

	public default void sellBiscuits() throws IOException {
		String answerForBiscuits;
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		do {
		    do {
		    	System.out.print("Whould you like to buy biscuits for coffee?"
		    			+ "\n" + "    |1.Yes 2.No|"
		    			+ "\n" + "Please choose a number: ");
		    	answerForBiscuits = reader.readLine();
		    } while (Integer.parseInt(answerForBiscuits)<=0);
		} while (Integer.parseInt(answerForBiscuits)>2);
		
		if (Integer.parseInt(answerForBiscuits)==1) {
			System.out.print("\n"+"Take your biscuits");
		}
	}
	
}

