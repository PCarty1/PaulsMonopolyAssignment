package edu.ncsu.monopoly;

/* Date: 20th Feb 2015
 * Author: Paul Carty
 */

public class Die {
	public int getRoll() {
		return (int)(Math.random() * 6) + 1;
	}
}
