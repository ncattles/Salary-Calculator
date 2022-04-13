import java.util.Scanner;

public class Salary{
public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    
    // intialize input salary 
    // initilize weekly salary (50 weeks)
    // initalize 40 hour work weeks 
    // intialize result (hourly salary OR annual salary)
    
    double userSalary;
    int weeks = 50;
    int workWeeks = 40;
    double result;
    
    // Tell user to enter their annual or hourly salary
    System.out.println("Enter your annual salary to find hourly wage");
    System.out.println("OR");
    System.out.println("Enter your hourly wage to find annual salary");
    userSalary = input.nextDouble();
    
    if (userSalary > 9999) {
    
        // Calculate hourly salary 
        result = userSalary / weeks / workWeeks;
            
        // Display hourly salary 
        System.out.printf("You would make %,20.2f per hour%n", result);
        System.out.println("(40 hour work week)");
    
    }

    else {

        // Calculate annual salary
        result = userSalary * workWeeks * weeks;

        // Display annual salary 
        System.out.printf("You would make %,20.0f a year%n", result);
        System.out.println("(40 hour work week)");
    
    }
}
}