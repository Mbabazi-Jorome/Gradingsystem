package gradingsystem;
import java.util.Scanner;

public class Gradingsystem {
		     public static void main(String[] args) {
		         // Create a Scanner object for input
		         Scanner Scanner = new Scanner(System.in);
		      System.out.print("enter number of students:");
		      int numStudents =Scanner.nextInt();
		      for(int i=1; i<=5;i++) {
		    	  System.out.print("enter marks for student" + i + ":");
		    	  int marks =
		    			  Scanner.nextInt();
		    	  //determining the grade basing on marks
		    	  if (marks >=90) {
		    		  System.out.println("Grade A");
		    	  }else if (marks >=80) {
		    		  System.out.println("Grade B");
		    	  }else if (marks>=70) {
		    		  System.out.println("Grade C");
		    	  }else if(marks>60) {
		    		  System.out.println("Grade D");
		    	  }else {
		    		  System.out.println("Grade F");
		    		  
		    	  }
		      }
		   
		      
		     }
		 }

		 