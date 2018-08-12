package com.virtusa.app;

import java.util.Scanner;

import com.virtusa.app.exception.InputRangeException;
import com.virtusa.app.service.Service;
import com.virtusa.app.service.ServiceImpl;

public class NumberToWordConverterApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		String input = scanner.nextLine();
		Service service = new ServiceImpl();
		String output;
		try {
			output = service.convertorService(input);
		} catch (InputRangeException e) {
			output = e.getMessage();
		} catch (NumberFormatException e) {
			output = "You entered an Invalid Integer Number or out of integer Range";
		}

		System.out.println(output);
		scanner.close();
	}

}
