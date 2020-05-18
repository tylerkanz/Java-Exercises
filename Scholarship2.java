//Exam Part 2
 // Author: Tyler Kanz

 
import java.util.Scanner;
 

public class Scholarship2{
 
        public static void main(String[] args){
             
            Scanner input = new Scanner(System.in);
            
			 
			//Input & Declarations
            System.out.println("Enter Student GPA: ");
            double gpa = input.nextDouble();
             
            System.out.println("Enter number of extracurricular activities: ");
            int extraCir = input.nextInt();
			
			System.out.println("Enter number of service activities: ");
            int serviceAct = input.nextInt();
             
			//Checking GPA Input
			 if (gpa < 0 || gpa > 4.0) {
			System.out.println("Invalid input!");
			}
			
			//Checking Scholarship Credentials
            else if(gpa >= 3.8 && extraCir >= 1){
                System.out.println("Scholarship candidate");
            }
			else if(gpa >= 3.4 && gpa < 3.8 && extraCir >= 3){
                System.out.println("Scholarship candidate");
            }
			else if(gpa >= 3.0 && gpa < 3.4 && extraCir >= 2 && serviceAct >= 3){
                System.out.println("Scholarship candidate");
            }
			
			//Does not meet requirements
            else{
                System.out.println("Not a candidate");
            }
             
        }
         
    }