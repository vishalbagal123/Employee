package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;

@SpringBootApplication
public class EmployeeCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
		
		int ch;
		int id;
		String name,dept;
		float salary;
		
		Scanner sc = new Scanner(System.in);
		var emp = new ArrayList<Employee>();
		
		while(true) {
			System.out.println(""" 
					1.Create
					2.Display
					3.Update
					4.Delete
					5.EXIT
					Enter a Choice :
					""");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1 ->{
				System.out.println("Enter a id :");
				id=sc.nextInt();
				System.out.println("Enter a Name :");
				name=sc.next();
				System.out.println("Enter a Department :");
				dept=sc.next();
				System.out.println("Enter a Salary :");
				salary=sc.nextFloat();
				
				emp.add(new Employee(id, name, dept, salary));
			}
			
			case 2->{
				for (Employee x : emp) {
					System.out.println(x);
				}
			}
			
			case 3-> {
				
			}
			
			case 4->{
				System.out.println("Enter a ID :");
				id=sc.nextInt();
				emp.remove(new Employee(id, null, null, 0)); 
			}
			
			default -> throw new IllegalArgumentException("Unexpected value : "+ch);
				
			}
		}
	}

}