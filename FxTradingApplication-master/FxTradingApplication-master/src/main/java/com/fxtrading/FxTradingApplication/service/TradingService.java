package com.fxtrading.FxTradingApplication.service;

import java.util.List;

import com.fxtrading.FxTradingApplication.dao.TradeDao;
import com.fxtrading.FxTradingApplication.entity.Book;
import com.fxtrading.FxTradingApplication.entity.Print;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class TradingService
{
	
@Autowired
TradeDao repository;

Print print = new Print();

final double rate =66.0;
public String Booking(Book value)


{
	print.setCustomerName(value.getCustomerName());
	print.setCurrencyPair(value.getCurrencyPair());
	print.setInrAmount(rate*value.getTranferAmount());
	print.setRate(rate);

	repository.save(print);

	return "Your Trade is Booked Successfully";
}


	public List<Print> printing()
{
		return repository.findAll();
}

	public String exit(String confirm) {
		if(confirm .equalsIgnoreCase("yes")) {
			return "Have a nice day";
		}
		return null;
}

}

