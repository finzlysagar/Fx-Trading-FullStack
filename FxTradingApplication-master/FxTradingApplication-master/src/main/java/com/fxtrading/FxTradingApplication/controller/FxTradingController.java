package com.fxtrading.FxTradingApplication.controller;
import java.util.List;

import com.fxtrading.FxTradingApplication.entity.Book;
import com.fxtrading.FxTradingApplication.entity.Print;
import com.fxtrading.FxTradingApplication.service.TradingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class FxTradingController {
	@Autowired
	TradingService fxTradingService ;


	
	String message = "localhost:8080/booktrade/book - use this url to book trade \n localhost:8080/printtrade - use this  url to print trade \n localhost:8080/exit/yes - use this url to exit ";

	@RequestMapping("message")
	public String message(){
		return message;
		
	}
	
	@PostMapping("booktrade")
	public String bookTrade(@RequestBody Book value) {
		return fxTradingService.Booking(value);
	}
	@GetMapping("printtrade")
	public List<Print> printTrading() {
		
		return fxTradingService.printing();
	}
	
	@PutMapping("exit/{confirm}")
	public String Exit(@PathVariable String confirm) {
		
		return "bye";
		
		
		
	}
	
}
