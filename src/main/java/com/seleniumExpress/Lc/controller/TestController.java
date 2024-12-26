package com.seleniumExpress.Lc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.seleniumExpress.Lc.DTO.UserInfoDTO;
import com.seleniumExpress.Lc.Service.EmailService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("DTO")
public class TestController {

	@Autowired
	public EmailService service;

	@RequestMapping("/hello")
	public String showHello(Model model) {

		UserInfoDTO dto = new UserInfoDTO();
		model.addAttribute("DTO", dto);

		return "HomePage";
	}

	@RequestMapping("/processData")
	public String process(Model model, @Valid UserInfoDTO dto, BindingResult result) {

		String relation = service.getRelation(dto.getYourName(), dto.getCrushName());
		dto.setResult(relation);
		model.addAttribute("DTO", dto);
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX + "DTO", result);

		if (result.hasErrors()) {
			return "HomePage";
		}
		model.addAttribute("result", relation);

		/*
		 * if (1 == 1) { System.out.println("Exception Occurs"); throw new
		 * NullPointerException(); }
		 */
		return "ResultPage";
	}

}
