package com.seleniumExpress;

public final class Bank {

	private final String bankName;

	private final Manager manager;

	public Bank(String bankName, Manager manager) {
		this.bankName = bankName;

		this.manager = manager;

	}

	public String getBankName() {
		return bankName;
	}

	public Manager getManager() throws CloneNotSupportedException {

		return (Manager) manager.clone();

		/*
		 * Manager manager2 = new Manager(); manager2.setmName(manager.getmName());
		 * return manager2;
		 */
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", manager=" + manager + "]";
	}

}
