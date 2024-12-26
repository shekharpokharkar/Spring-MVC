package com.seleniumExpress.Lc.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumExpress.Lc.DTO.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		/*
		 * System.out.println("Inside phoneNumberFormatter Print method");
		 * System.out.println("phone"+phone.getCountryCode() + "-" +
		 * phone.getPhonenumber());
		 */return phone.getCountryCode() + "-" + phone.getPhonenumber();
	}

	@Override
	public Phone parse(String phoneNumber, Locale locale) throws ParseException {
		/*
		 * System.out.println("Inside phoneNumberFormatter Parse method");
		 */String[] phoneumber1 = phoneNumber.split("-");
		Phone phone1 = new Phone();
		if ((phoneumber1[0] == null) || (phoneumber1[0]).equals("-")) {
			phone1.setCountryCode("91");
		} else {
			phone1.setCountryCode(phoneumber1[0]);
			phone1.setPhonenumber(phoneumber1[1]);
		}
		
		return phone1;
	}

}
