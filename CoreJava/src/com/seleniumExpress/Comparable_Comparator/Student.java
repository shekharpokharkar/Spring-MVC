package com.seleniumExpress.Comparable_Comparator;

public class Student implements Comparable<Student> {

	private int sid;
	private String sName;
	private long sMarks;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getsMarks() {
		return sMarks;
	}

	public void setsMarks(long sMarks) {
		this.sMarks = sMarks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sMarks=" + sMarks + "]";
	}

	public Student(int sid, String sName, long sMarks) {

		this.sid = sid;
		this.sName = sName;
		this.sMarks = sMarks;
	}

	public Student() {

	}

	@Override
	public int compareTo(Student stu) {

		/*
		 * int sid2 = stu.getSid(); int sid1=this.sid;
		 * 
		 * if(sid2 == sid1) { return 0; }else if(sid2 < sid1) { return -1; } else {
		 * return +1; }
		 */

		return Integer.valueOf(this.sid).compareTo(stu.sid);

	}

}