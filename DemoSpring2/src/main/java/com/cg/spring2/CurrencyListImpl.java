package com.cg.spring2;

import java.util.ArrayList;

public class CurrencyListImpl implements CurrencyList {

	ArrayList<String> currList;
	
	
	public void setCurrList(ArrayList<String> currList) {
		this.currList = currList;
	}


	public ArrayList<String> getCurrList() {
		
		return currList;
	}

}
