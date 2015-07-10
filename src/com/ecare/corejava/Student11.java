package com.ecare.corejava;

	class Student11{  
	    int id;  
    String name; 
    int age;
    Student11(int id,String name){
    	System.out.println("first  contructor");
    	this.id = id;  
	    this.name = name;  
    	}
	    Student11(int id,String name,int age){ 
	    	this(id,name);
	    	this.age=age;
	    
	    
	    }  
    void display(){System.out.println(id+" "+name+""+age);}  
    public static void main(String args[]){  
    	
    Student11 s1 = new Student11(111,"Karan",25);  
	   //Student11 s2 = new Student11(222,"Aryan",36);  
    s1.display();  
   //s2.display();  
}
	}