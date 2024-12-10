package com.seleniumExpress.Immutable;

import java.util.ArrayList;
import java.util.List;

public final class EmployeeList {

	private final int eid;
	private final String eName;
	private final List<String> eHobbies;

	public EmployeeList(int eid, String eName, List<String> hobb) {

		this.eid = eid;
		this.eName = eName;
		this.eHobbies = new ArrayList<>();
		for (String str : hobb) {
			eHobbies.add(str);
		}
	}

	public int getEid() {
		return eid;
	}

	
	public String geteName() {
		return eName;
	}

	
	public List<String> geteHobbies() {
		
		List<String> eHobb=new ArrayList<>();
		for (String str : eHobbies) {
			eHobb.add(str);
		}
		return eHobb;
	}

	

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eHobbies=" + eHobbies + "]";
	}

}
