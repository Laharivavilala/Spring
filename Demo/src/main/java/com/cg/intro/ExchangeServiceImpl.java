package com.cg.intro;

public class ExchangeServiceImpl implements ExchangeService{

	
	private double exchangeRate;
	public ExchangeServiceImpl(double exchangeRate) {
	
		this.exchangeRate = exchangeRate;
		System.out.println("ExchangeserviceImpl()");
	}

	public double getExchangeRate() {
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}

}
