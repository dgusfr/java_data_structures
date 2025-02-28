package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee> employees = new ArrayList<>();
        
        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
		
        for(int i = 0; i < n; i++) {
        	System.out.println("Employee #" + (i + 1) + ":");
        	
        	System.out.println("Id:");
        	int id = sc.nextInt();
        	sc.nextLine();
        	
        	System.out.println("Name:");
        	String name = sc.nextLine();
        	
        	System.out.println("Salary: ");
        	double salary = sc.nextDouble();
        	
        	employees.add(new Employee(id, name, salary));
        }
		
		System.out.println("Enter the employee id that will have salary increase:");
		int idToIncrease = sc.nextInt();
		
		Employee emp = null;
		for(Employee e : employees) {
			if(e.getId() == idToIncrease) {
				emp = e;
				break;
			}
		}
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println("List of employees:");
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
