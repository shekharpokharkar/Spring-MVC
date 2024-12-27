package com.seleniumExpress.Lc.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.seleniumExpress.Lc.DTO.EmailDto;
import com.seleniumExpress.Lc.DTO.UserInfoDTO;
import com.seleniumExpress.Lc.Service.EmailServiceImpl;
import com.seleniumExpress.Lc.Validator.AgeValidator2;


@Controller
public class EmailController {

	@Autowired
	private EmailServiceImpl emailService;

	@RequestMapping("/send_Email")
	public String sendEmail(@ModelAttribute("EmailDTO") EmailDto email) {
		return "Email";
	}

	@RequestMapping("/process_Email")
	public String processEmail(@SessionAttribute("DTO") UserInfoDTO dto, @ModelAttribute("EmailDTO") EmailDto email) {

		String email2 = email.getEmail();
		try {
			emailService.sendEmail(dto.getYourName(), email2, "Friend");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Email_Result";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//System.out.println("Inside Init Data binder");
		// 20,000.00 -> 20000.00
		NumberFormat format = new DecimalFormat("##,###.00");
		CustomNumberEditor editor = new CustomNumberEditor(BigDecimal.class, format, true);
		binder.registerCustomEditor(BigDecimal.class, "amount", editor);

		// 22-02-2003 -> 02/22/2003
		DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor1 = new CustomDateEditor(dateformat, true);
		binder.registerCustomEditor(Date.class, "date", editor1);

		//System.out.println("*****1213**********");
		binder.addValidators(new AgeValidator2());

	}

}
