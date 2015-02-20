package edu.ncsu.monopoly;

/* Date: 20th Feb 2015
 * Author: Paul Carty
 */

public class MockRespondDialog implements RespondDialog {
    public MockRespondDialog(TradeDeal deal) {
    }

    public boolean getResponse() {
        return true;
    }
}
