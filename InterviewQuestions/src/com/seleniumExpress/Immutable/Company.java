package com.seleniumExpress.Immutable;

public class Company implements Cloneable{

	private String companyName;
	private int companySize;

	public Company() {
		
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCompanySize() {
		return companySize;
	}

	public void setCompanySize(int companySize) {
		this.companySize = companySize;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companySize=" + companySize + "]";
	}

	public Company(String companyName, int companySize) {

		this.companyName = companyName;
		this.companySize = companySize;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
