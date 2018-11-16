package com.cg.intro;

public class CurrencyConverterImpl implements CurrencyConverter {

	
	private ExchangeService exchangeService;
	
	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");
		return exchangeService;
		
	}

	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");
		this.exchangeService = exchangeService;
	}
	

	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl()");
	}


	public double dollarsToRupees(double dollars) {
				System.out.println("dollarsToRupees()");
				return dollars*exchangeService.getExchangeRate();
	}

}
