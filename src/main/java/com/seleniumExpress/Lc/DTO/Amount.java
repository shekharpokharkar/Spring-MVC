package com.seleniumExpress.Lc.DTO;

import java.math.BigDecimal;

public class Amount {

	private BigDecimal billAmount;
	private String localDefination;
	
	public BigDecimal getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	public String getLocalDefination() {
		return localDefination;
	}
	public void setLocalDefination(String localDefination) {
		this.localDefination = localDefination;
	}
	@Override
	public String toString() {
		return billAmount + " " + localDefination;
	}
	
}
