package com.seleniumExpress.Lc.Validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {AgeValidator.class})
public @interface Age {

	int min() default 18;

	int max() default 75;
	
	public String message() default "{Age.age}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
