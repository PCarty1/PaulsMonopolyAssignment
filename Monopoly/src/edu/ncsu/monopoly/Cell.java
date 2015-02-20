package edu.ncsu.monopoly;

/* Date: 20th Feb 2015
 * Author: Paul Carty
 */


public abstract class Cell implements IOwnable {
	private boolean available = true;
	private String name;
	protected Player theOwner; //Exercise two

	public String getName() {
		return name;
	}

	public Player getTheOwner() {
		return theOwner;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract boolean playAction(String msg);

	
	public void setName(String name) {
		this.name = name;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }
}