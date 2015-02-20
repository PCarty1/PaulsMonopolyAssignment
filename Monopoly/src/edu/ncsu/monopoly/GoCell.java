package edu.ncsu.monopoly;

/* Date: 20th Feb 2015
 * Author: Paul Carty
 */

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public boolean playAction(String msg) {
		return true;
	}
	
	public void setName(String name) {
	}
}
