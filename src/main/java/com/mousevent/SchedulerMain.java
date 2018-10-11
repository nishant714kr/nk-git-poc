package com.mousevent;

import java.util.Timer;


//Main class
public class SchedulerMain {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer(); // Instantiate Timer Object
		SchTaskHitNext st = new SchTaskHitNext(); // Instantiate SheduledTask class
		time.schedule(st, 0, 10000); 
		SchTaskHitReturn rt = new SchTaskHitReturn();
		time.schedule(rt, 0, 5000);
	}
}