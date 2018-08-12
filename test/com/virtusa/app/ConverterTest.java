package com.virtusa.app;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com.virtusa.app.converter.Converter;

public class ConverterTest {
	
	
	private static Converter converter;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		converter = new Converter();
	}

	@Test
	public void convertTest() {
		assertEquals("one",converter.convert(1));
	}
	
	@Test
	public void convertTestFor56945781() {
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one",converter.convert(56945781));
	}

}
