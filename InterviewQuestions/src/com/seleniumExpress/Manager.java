package com.seleniumExpress;

public class Manager implements Cloneable {
	
	private String mName;
	
	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmName() {
		return mName;
	}

	@Override
	public String toString() {
		return "Manager [mName=" + mName + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	
	
	
}
