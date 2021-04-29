package inheritanceDemo;

public class StudentUser extends User {
	
	private String studentName;
	private String studentPassword;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
}
