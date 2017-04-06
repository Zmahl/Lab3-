package pkgExceptions;

import java.util.ArrayList;


import pkgPokerBLL.Hand;


public class HandException2 extends Exception {

	private ArrayList<Hand> hands;

	public HandException2(ArrayList<Hand> hands) {
		super();
		this.hands = hands;
	}

	public ArrayList<Hand> getHands() {
		return hands;
	}
	
	
	
}