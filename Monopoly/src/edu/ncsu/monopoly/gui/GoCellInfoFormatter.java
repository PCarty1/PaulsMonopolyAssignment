package edu.ncsu.monopoly.gui;

/* Date: 20th Feb 2015
 * Author: Paul Carty
 */

import edu.ncsu.monopoly.Cell;

public class GoCellInfoFormatter implements CellInfoFormatter {
    
    public static final String GO_CELL_LABEL = "<html><b>Go</b></html>";
    
    public String format(Cell cell) {
        return GO_CELL_LABEL;
    }
}
