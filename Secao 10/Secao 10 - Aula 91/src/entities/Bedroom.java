package entities;

public class Bedroom {
	private String studentName;
	private String studentEmail;
	
	public Bedroom(String name, String email) {
		this.studentName = name;
		this.studentEmail = email;
	}
	
	@Override
	public String toString() {
		return this.getStudentName() + ", " + this.getStudentEmail();
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}
	
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
}
