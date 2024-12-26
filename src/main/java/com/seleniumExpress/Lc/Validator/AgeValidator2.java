package com.seleniumExpress.Lc.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.seleniumExpress.Lc.DTO.UserRegistration;

public class AgeValidator2 implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("====shekhar======");
		return UserRegistration.class.equals(clazz);
	}

	@Override
	public void validate(Object userReg, Errors errors) {
		System.out.println("====shekhar======");
		Integer age = ((UserRegistration) userReg).getAge();
		if (age < 27 || age > 60 || age == 0) {
			
			errors.rejectValue("age", "Age.Invalid","age should be between 26-60");
		}
	}

}
