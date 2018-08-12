package com.virtusa.app.service;

import com.virtusa.app.converter.Converter;
import com.virtusa.app.exception.InputRangeException;

public class Service {

	public String convertorService(String input) throws InputRangeException {
		
		int inputNumber;
		try {
			inputNumber = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return "You entered an Invalid Integer Number";
		}
		if (inputNumber <= 0 || inputNumber > 999999999) {
			throw new InputRangeException("Enter numbers between 0 and 999,999,999.");
		} else {
			Converter converter = new Converter();
			String s1 = converter.convert(inputNumber);
			return s1;
		}
		
	}

}
