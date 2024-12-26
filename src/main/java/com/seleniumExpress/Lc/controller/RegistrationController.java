package com.seleniumExpress.Lc.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumExpress.Lc.DTO.Amount;
import com.seleniumExpress.Lc.DTO.Bill;
import com.seleniumExpress.Lc.DTO.CommunicationDTO;
import com.seleniumExpress.Lc.DTO.Creditcard;
import com.seleniumExpress.Lc.DTO.Phone;
import com.seleniumExpress.Lc.DTO.UserRegistration;
import com.seleniumExpress.Lc.Validator.AgeValidator2;

import jakarta.validation.Valid;

@Controller
public class RegistrationController {

	@RequestMapping("/Register")
	public String showRegistrationPage(@ModelAttribute("REG") UserRegistration reg) {
		CommunicationDTO cDto = new CommunicationDTO();
		Phone p = new Phone();
		p.setCountryCode("91");
		p.setPhonenumber("9890526103");
		cDto.setPhone(p);

		Creditcard c = new Creditcard();
		c.setFirstFourNumber(1234);
		c.setSecondFourNumber(1234);
		c.setThirdFourNumber(1234);
		c.setFourthFourNumber(1234);

		Bill bill = new Bill();
		bill.setCreditardNumber(c);

		Amount amount = new Amount();
		amount.setBillAmount(new BigDecimal(1234));
		amount.setLocalDefination("$");

		bill.setAmount(amount);
		reg.setPay(bill);

		reg.setContact(cDto);
		return "Register";

	}

	@RequestMapping("/process_Registrion")
	public String processRegistrationPage(@Valid @ModelAttribute("REG") UserRegistration reg, BindingResult result) {

		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError s : allErrors) {
				System.out.println(s);
			}
			return "Register";
		}
		return "Register_Success";

	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Inside Init Data binder");
		// 20,000.00 -> 20000.00
		NumberFormat format = new DecimalFormat("##,###.00");
		CustomNumberEditor editor = new CustomNumberEditor(BigDecimal.class, format, true);
		binder.registerCustomEditor(BigDecimal.class, "amount", editor);

		// 22-02-2003 -> 02/22/2003
		DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor1 = new CustomDateEditor(dateformat, true);
		binder.registerCustomEditor(Date.class, "date", editor1);

		System.out.println("*****inside init Binder******");
		binder.addValidators(new AgeValidator2());

	}

}
