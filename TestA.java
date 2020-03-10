package com.capgemini.assignment.array;

public class TestA {
	public static void main(String[] args) {
		Employee[] e=new Employee[5];
		Employee e1=new Employee(101, "Rupesh", 25000);
		Employee e2=new Employee(102, "Mukesh", 25000);
		Employee e3=new Employee(103, "Vijay", 25000);
		Employee e4=new Employee(104, "Dikshith", 25000);
		Employee e5=new Employee(105, "Vamshi", 25000);
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		e[3]=e4;
		e[4]=e5;
		printEmployeeDetails(e);
		Employee[] e11=getEmployeeDetails();
		printEmployeeDetails(e11);
		
	}
	static void printEmployeeDetails(Employee[] e1) {
		for(int i=0;i<e1.length;i++) {
			System.out.println("Name - "+e1[i].ename);
			System.out.println("ID - "+e1[i].eid);
			System.out.println("Salary - "+e1[i].salary);
			System.out.println("***********************");
		}		
	}
	static Employee[] getEmployeeDetails() {
		Employee[] e=new Employee[5];
		Employee e1=new Employee(201, "Srikanth", 25000);
		Employee e2=new Employee(202, "Venkat", 25000);
		Employee e3=new Employee(203, "Karthik", 25000);
		Employee e4=new Employee(204, "Shashi", 25000);
		Employee e5=new Employee(205, "Rakesh", 25000);
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		e[3]=e4;
		e[4]=e5;
		return e;
	}
}
