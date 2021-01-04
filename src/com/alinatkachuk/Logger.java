package com.alinatkachuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
	
	public void makeLog(File file, String message) throws FileNotFoundException {
		SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MM-yyyy HH:mm ");
		Calendar calendar = Calendar.getInstance();
		String DataTime = formattedDate.format(calendar.getTime());
		
		PrintWriter printwriter = new PrintWriter(file);
		printwriter.println(DataTime+message);
		printwriter.close();
	}
 }
