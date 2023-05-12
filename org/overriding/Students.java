//Class:Students
//Methods:getStudentInfo()

//Description:
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber




package org.overriding;

public class Students {
public void getStudentInfo(int id)
{
	System.out.println(id);
}
public void getStudentInfo(int id, String name) {
	System.out.println(id+name);
}
public void getStudentInfo(String email, int phoneNumber) {
	System.out.println(email+phoneNumber);
}
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(3);
		stud.getStudentInfo(01, "Bharathi");
		stud.getStudentInfo("ahfyagd@gmail.com", 2354667);
		
	}

}
