package com.seleniumExpress.HashMapKey;

public class FakeStudent extends Student {

	private String fakestudentName;

	public FakeStudent(String studentName) {
		super(studentName);
		this.fakestudentName = studentName;
	}

	public String getFakestudentName() {
		return fakestudentName;
	}

	public void setFakestudentName(String fakestudentName) {
		this.fakestudentName = fakestudentName;
	}

	@Override
	public String getStudentName() {

		return fakestudentName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fakestudentName == null) ? 0 : fakestudentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FakeStudent other = (FakeStudent) obj;
		if (fakestudentName == null) {
			if (other.fakestudentName != null)
				return false;
		} else if (!fakestudentName.equals(other.fakestudentName))
			return false;
		return true;
	}

}
