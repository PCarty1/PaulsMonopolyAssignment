package edu.ncsu.monopoly.gui;

/* Date: 20th Feb 2015
 * Author: Paul Carty
 */

import edu.ncsu.monopoly.Cell;

public class GotoJailCellInfoFormatter implements CellInfoFormatter {

    public static final String GOTO_JAIL_LABEL = "<html><b>Go to Jail</b></html>";

    public String format(Cell cell) {
    	return GOTO_JAIL_LABEL;
	}
}
