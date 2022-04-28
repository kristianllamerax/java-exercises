
class Staff extends UEmployee{
	
	public void setJobTitle(String title) {
		jobTitle = title;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	@Override
	public String toString() {
		return (" Job Title: " +jobTitle);
	}
}
