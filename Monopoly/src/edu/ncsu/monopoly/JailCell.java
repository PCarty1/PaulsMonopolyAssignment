package edu.ncsu.monopoly;

/* Date: 20th Feb 2015
 * Author: Paul Carty
 */

public class JailCell extends Cell {
	public static int BAIL = 50;
	
	public JailCell() {
		setName("Jail");
	}
	
	public boolean playAction(String msg) {
		return true;
		
	}
}
