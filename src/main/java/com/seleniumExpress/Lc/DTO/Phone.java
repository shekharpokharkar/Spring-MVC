package com.seleniumExpress.Lc.DTO;

public class Phone {

	private String countryCode;
	private String phonenumber;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return countryCode + "-" + phonenumber;
	}

	

}
