
 class Faculty extends UEmployee{

	public void setDepartmentName(String department) {
		departmentName = department;
	}
	
	public 	String getDepartmentName() {
		return departmentName;
	}
	
	@Override
	public String toString() {
		return ("\nDepartment: "+departmentName);
	}
}
