package com.seleniumExpress.Lc.DTO;

public class Bill {
	
	private Amount amount;
	private Creditcard creditardNumber;
	
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public Creditcard getCreditardNumber() {
		return creditardNumber;
	}
	public void setCreditardNumber(Creditcard creditardNumber) {
		this.creditardNumber = creditardNumber;
	}

}
