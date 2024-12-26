package com.seleniumExpress.Lc.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;

	@Override
	public void initialize(Age age) {
		this.lower = age.min();
		this.upper = age.max();
	}

	@Override
	public boolean isValid(Integer agevalue, ConstraintValidatorContext context) {
	
		if (agevalue < lower || agevalue > upper || agevalue == null) {
			return false;
		}
		return true;
	}

}
