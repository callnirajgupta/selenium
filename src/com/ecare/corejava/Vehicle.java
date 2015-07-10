package com.ecare.corejava;

class Vehicle{ 
	void message(){System.out.println("welcome");}  

}  
class Bike2 extends Vehicle{
	void display(){
		message();
	}
	
  
public static void main(String args[]){  
Bike2 obj = new Bike2();  
obj.message();
obj.display();

}  
}

