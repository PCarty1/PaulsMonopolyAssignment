package edu.ncsu.monopoly.gui;

/* Date: 20th Feb 2015
 * Author: Paul Carty
 */

import edu.ncsu.monopoly.Cell;

public class ChanceCellInfoFormatter implements CellInfoFormatter {
    
    public static final String CHANCE_CELL_LABEL = "<html><font color='teal'><b>Chance</b></font></html>";
    
    public String format(Cell cell) {
        return CHANCE_CELL_LABEL;
    }
}
