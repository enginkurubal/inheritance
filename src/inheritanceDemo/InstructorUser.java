package inheritanceDemo;

public class InstructorUser extends User {
	
	private String instructorName;
	private String instructorPassword;
	
	
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}
	
	
}
