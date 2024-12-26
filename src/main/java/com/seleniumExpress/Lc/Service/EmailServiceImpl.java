package com.seleniumExpress.Lc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

	public static final String WORD = "FLAMES";
	@Autowired
	public JavaMailSender sender;

	@Override
	public void sendEmail(String UserName, String Email, String Result) {

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setText(Result);
		msg.setTo(Email);
		msg.setSubject("Hii " + UserName + " Love Calculator Application Result is " + Result);
		sender.send(msg);
	}

	@Override
	public String getRelation(String yourName, String crushName) {

		int ilength = (yourName + crushName).toCharArray().length;
		int wlenght = WORD.length();
		
		int val = ilength % wlenght;
		String relation = getRelation(val);
		return relation;

	}

	private String getRelation(int val) {

		String relation = null;
		
		boolean flag = true;
		while (flag) {

			switch (val) {
			case 0:
				relation = LoveCalculatorProperties.F_CHAR_MEANING;
				flag = false;
				
				break;
			case 1:
				relation = LoveCalculatorProperties.L_CHAR_MEANING;
				flag = false;
				break;
			case 2:
				relation = LoveCalculatorProperties.A_CHAR_MEANING;
				flag = false;

				break;
			case 3:
				relation = LoveCalculatorProperties.M_CHAR_MEANING;
				flag = false;
				break;
			case 4:
				relation = LoveCalculatorProperties.E_CHAR_MEANING;
				flag = false;
				break;
			case 5:
				relation = LoveCalculatorProperties.S_CHAR_MEANING;
				flag = false;
				break;
			default:
				relation = "your relation is not health to calculate relation";
				flag = false;
			}
			
		}
	
		return relation;

	}

}
