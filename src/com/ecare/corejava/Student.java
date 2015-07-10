package com.ecare.corejava;

public class Student {

	int id;
	String name;
	void insertUser(int a,String b){
		id=a;
		name=b;
	}
	
void display(){
		System.out.println("id:" +id+ "name:"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//new Student().insertUser(1111,"abc");
new Student().display();


	}

}
