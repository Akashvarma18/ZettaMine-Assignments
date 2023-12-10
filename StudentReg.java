package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReg {
	static Scanner input = new Scanner(System.in);

    static int number = 100;
    static String collegeName;
    String studentId;
    String studentName;
    String studentEmail;


    public StudentReg(String collegeName, String studentName, String studentEmail) {
        super();
        this.collegeName = collegeName;
        this.studentId = collegeName + String.valueOf(number);
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        number++;
    }
    
    

    public static Scanner getInput() {
		return input;
	}



	public static int getNumber() {
		return number;
	}



	public static String getCollegeName() {
		return collegeName;
	}



	public String getStudentId() {
		return studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public String getStudentEmail() {
		return studentEmail;
	}



	@Override
    public String toString() {
        return "ID: " + studentId + " | EMAIL: " + studentEmail + " | Name: " + studentName;
    }

    public static void main(String[] args) {
    	
    	int noOfAdmissions = 1;
    	
    	String collegeName= "Zetta-";

        List<StudentReg> stulist = new ArrayList<>();
        
        for(int i =0; i<noOfAdmissions; i++) {
        	System.out.println("Enter student name and email: ");
        	String name = input.next();
        	String email = input.next();
        	stulist.add(new StudentReg(collegeName, name, email));
        	System.out.println("Do you want to add more students?[Y/N]");
        	String decision = input.next();
        	if(decision.equals("Y")) {
        		noOfAdmissions = noOfAdmissions+1;
        	}else {       		 
        		displayOutput(stulist);
        	}
        	       	
        }
        
      
       
     
    }

	private static void displayOutput(List<StudentReg> stulist) {
		
		System.out.println("ID: /t"+ "Name /t" + "Email /t" + "CollegeName" );
		for(int i=0; i<stulist.size();i++) {
			System.out.println(stulist);
		}
		
		
	}
}
