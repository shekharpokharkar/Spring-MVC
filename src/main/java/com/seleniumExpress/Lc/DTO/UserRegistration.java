package com.seleniumExpress.Lc.DTO;

import com.seleniumExpress.Lc.Validator.Age;

public class UserRegistration {
	
	
	//@Age(min=27,max=60 ,message = "{Age.Invalid}" )
	private Integer age;
	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String gender;
	private String[] hobby;
	private CommunicationDTO contact;
	private Bill pay;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public CommunicationDTO getContact() {
		return contact;
	}

	public void setContact(CommunicationDTO contact) {
		this.contact = contact;
	}

	public Bill getPay() {
		return pay;
	}

	public void setPay(Bill pay) {
		this.pay = pay;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}



	

}