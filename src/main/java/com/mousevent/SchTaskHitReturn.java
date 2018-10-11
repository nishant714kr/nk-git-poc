package com.mousevent;

import java.util.TimerTask;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Date;

// Create a class extends with TimerTask
public class SchTaskHitReturn extends TimerTask {

	Date now; // to display current time
	int pointX=648;
	int pointY=398;
	String event = "";
	

	// Add your task here
	public void run() {
		now = new Date(); // initialize date
		System.out.println("Return clicked at :" + now); // Display current time
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