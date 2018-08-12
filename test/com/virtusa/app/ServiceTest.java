package com.virtusa.app;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import com.virtusa.app.exception.InputRangeException;
import com.virtusa.app.service.Service;

public class ServiceTest {
	
	private static Service service = new Service();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new Service();
	}
	
	@Test
	public void validInputOnetest() throws InputRangeException {
		assertEquals("one",service.convertorService("1"));
	}
	
	@Test
	public void validInputtwentyOneTest() throws InputRangeException {
		assertEquals( "twenty one",service.convertorService("21"));
	}
	
	@Test
	public void validInputoneHundredAndFiveTest() throws InputRangeException {
		assertEquals("one hundred and five", service.convertorService("105"));
	}
	
	@Test
	public void validInputtest() throws InputRangeException {
		assertEquals( "fifty six million nine hundred and forty five thousand seven hundred and eighty one",service.convertorService("56945781"));
	}
	
	@Test(expected = InputRangeException.class)
	public void inputMoreThanRangetest() throws InputRangeException {
		assertEquals(service.convertorService("1000000000"), "gghghh");
	}
	
	@Test(expected = InputRangeException.class)
	public void inputBelowRangetest() throws InputRangeException {
		assertEquals(service.convertorService("0"), "gghghh");
	}
}
