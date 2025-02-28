package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee> employees = new ArrayList<>();
        
        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
		
		for(String employee : employees) {
			System.out.println("Employee #");
			System.out.println("Id:");
			System.out.println("Name:");
			System.out.println("Salary:");
		}
		
		System.out.println("Enter the employee id that will have salary increase:");
        if(employees.stream() != null) {
        	
        	
        }
		System.out.println("Enter the percentage:");

	}

}
