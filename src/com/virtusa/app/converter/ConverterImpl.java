package com.virtusa.app.converter;

public class ConverterImpl implements Converter {

	StringBuilder stringBuilder = new StringBuilder();

	public String convert(int n) {

		ConverterImpl a = new ConverterImpl();
		a.build((n / 100000000), " hundred", (n / 1000000) % 100, " million");
		a.build(((n / 100000) % 10), " hundred", ((n / 1000) % 100), " thousand");
		a.build(((n / 100) % 10), " hundred", (n % 100), "");
		return a.stringBuilder.toString().trim();

	}

	private void build(int n, String ch, int j, String ch1) {

		String one[] = { "", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", " fifteen", " sixteen", " seventeen", " eighteen",
				" nineteen" };

		String ten[] = { "", "", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety" };

		if (n > 19) {
			stringBuilder.append(ten[n / 10] + "" + one[n % 10]);
		} else {
			stringBuilder.append(one[n]);
		}
		if (n > 0)
			stringBuilder.append(ch);
		if (n != 0 && j > 0)
			stringBuilder.append(" and");

		if (j > 19) {
			stringBuilder.append(ten[j / 10] + "" + one[j % 10]);
		} else {
			stringBuilder.append(one[j]);
		}
		if (n > 0 || j > 0)
			stringBuilder.append(ch1);
	}

}
