package com.capgemini.assignment.array;

public class TestObject {
	public static void main(String[] args) {
		
		
	ObjectArray[] b=new ObjectArray[2];
	ObjectArray s1=new ObjectArray(1,"Karthik");
	ObjectArray s2=new ObjectArray(2,"Srikanth");
	b[0]=s1;
	b[1]=s2;
	display(b);
}
	static void display(ObjectArray[] n) {
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i].x);
		System.out.println(n[i].y);
		}
	}

}
