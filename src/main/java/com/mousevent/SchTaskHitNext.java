package com.mousevent;

import java.util.TimerTask;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Date;

// Create a class extends with TimerTask
public class SchTaskHitNext extends TimerTask {

	Date now; // to display current time
	int pointX=1822;
	int pointY=109;
	String event = "";
	
	//634, 398

	// Add your task here
	public void run() {
		now = new Date(); // initialize date
		System.out.println("Next clicked at is :" + now); // Display current time
		try {
			click(pointX, pointY);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static void click(int x, int y) throws AWTException{
	    Robot bot = new Robot();
	    bot.mouseMove(x, y);    
	    bot.mousePress(InputEvent.BUTTON1_MASK);
	    bot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
}