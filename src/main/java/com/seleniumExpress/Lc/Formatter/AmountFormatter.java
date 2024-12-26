package com.seleniumExpress.Lc.Formatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumExpress.Lc.DTO.Amount;

public class AmountFormatter implements Formatter<Amount> {

	@Override
	public String print(Amount object, Locale locale) {
		//System.out.println("Inside Amount formatter print method");
		return null;
	}

	@Override
	public Amount parse(String amount, Locale locale) throws ParseException {
		/*
		 * System.out.println("Inside Amount formatter parse method");
		 * System.out.println("amount" + amount);
		 */
		String[] split = amount.split(" ");
		/*
		 * for (String s : split) { System.out.println(s); }
		 */
		Amount value = new Amount();
		value.setBillAmount(new BigDecimal(split[0]));
		Currency instance = Currency.getInstance(split[1]);
		/*
		 * System.out.println(instance); 
		 */
		String symbol = instance.getSymbol();
		/* System.out.println(symbol);
		 */
		value.setLocalDefination(symbol);
		
		
		//System.out.println(locale);
		return value;
	}

}
