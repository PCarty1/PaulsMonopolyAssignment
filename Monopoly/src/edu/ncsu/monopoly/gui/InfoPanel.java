package edu.ncsu.monopoly.gui;

/* Date: 20th Feb 2015
 * Author: Paul Carty
 */

import java.awt.GridLayout;

import javax.swing.JPanel;

import edu.ncsu.monopoly.GameMaster;

public class InfoPanel extends JPanel {
	public void displayInfo() {
		GameMaster master = GameMaster.instance();
		setLayout(new GridLayout(1, master.getNumberOfPlayers()));
		for (int i = 0; i< master.getNumberOfPlayers(); i++){
			PlayerPanel panel = new PlayerPanel(master.getPlayer(i));
			add(panel);
			panel.displayInfo();
		}
	}
}
