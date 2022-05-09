package ProblemOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		int numberOfStudent;
		String userInput;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("please enter total student number:");
		numberOfStudent = sc.nextInt();
		
		System.out.println("Enter student name and score like this format studentName  studentScore:");
		sc.nextLine();
		for(int i=0; i<numberOfStudent; i++) {
			
			 userInput = sc.nextLine();           
	            String[] arrayOfStudent = userInput.split("\\s+");
	            if(arrayOfStudent.length==2) {
	            double score = Double.parseDouble(arrayOfStudent[1]);
	            Student std =new Student(arrayOfStudent[0],score );
	           students.add(std);
	            }
	            
	            else {
	            	System.out.println("please enter valid format input!!");
	            }
	            
		}
		
		double temp = 0;  String studentName = null;
		for(int i=0; i<students.size(); i++) {
			 for (int j = i + 1; j < students.size(); j++)   
	            {  
	                if (students.get(i).studentScore > students.get(j).studentScore)   
	                {  
                   temp = students.get(i).studentScore; 
                   studentName = students.get(i).studentName;
                   students.get(i).studentScore = students.get(j).studentScore;  
                   students.get(j).studentScore = temp;  
	                }  
	            }  
		}
		System.out.println("=========================");
		System.out.println("Highest Score Student Name is: ");
		System.out.println(studentName);
		
		
		
	}
}
