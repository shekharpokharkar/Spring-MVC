package com.seleniumExpress.Lc.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumExpress.Lc.DTO.Creditcard;

public class CreditCardFormatter implements Formatter<Creditcard> {

	@Override
	public String print(Creditcard creditcardNo, Locale locale) {
		//System.out.println("Inside creditcard formatter print Method");
		return creditcardNo.getFirstFourNumber()+"-"+creditcardNo.getSecondFourNumber()+"-"+creditcardNo.getThirdFourNumber()+"-"+creditcardNo.getFourthFourNumber();
	}

	@Override
	public Creditcard parse(String cardNo, Locale locale) throws ParseException {
		//System.out.println("Inside Creditcard Formatter Parse Method");
		String[] no = cardNo.split("-");
		Creditcard cno=new Creditcard();
		Integer.parseInt(no[0]);
		
		cno.setFirstFourNumber(Integer.parseInt(no[0]));
		cno.setSecondFourNumber(Integer.parseInt(no[1]));
		cno.setThirdFourNumber(Integer.parseInt(no[2]));
		cno.setFourthFourNumber(Integer.parseInt(no[3]));
		//System.out.println("No"+cno);
		return cno;
	}

}
