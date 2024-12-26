package com.seleniumExpress.Lc.DTO;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserInfoDTO {

	
	@NotNull(message = "* YourName cant be blank")
	@NotBlank(message = "* YourName cant be blank")
	@Size(max = 15, min = 3, message = "* YourName must have atleast 3 caracter")
	private String yourName;
	@NotNull(message = "* CrushName cant be blank")
	@NotBlank(message = "* CrushName cant be blank")
	@Size(max = 15, min = 3, message = "* CrushName must have atleast 3 caracter")
	private String crushName;
	
	private String result;
	@AssertTrue(message ="* To use this App You have to agree terms and conditions")
	private boolean termsAndcondition;

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [yourName=" + yourName + ", crushName=" + crushName + ", termsAndcondition="
				+ termsAndcondition + "]";
	}

	public boolean isTermsAndcondition() {
		return termsAndcondition;
	}

	public void setTermsAndcondition(boolean termsAndcondition) {
		this.termsAndcondition = termsAndcondition;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
