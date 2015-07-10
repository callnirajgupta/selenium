package com.ecare.corejava;

abstract class Bike{  
	  Bike(){System.out.println("bike is created");}  
	  abstract void run();  
	  abstract void stop();
	   void changeGear(){System.out.println("gear changed");}  
	}  
	  
	abstract class Honda extends Bike{  
	 void run(){System.out.println("running safely.. honda");}  
	 }  
	class Hero extends Bike{
		void run(){System.out.println("running safely..hero");}  
		void stop(){
			System.out.println("stop hero");
		}
	}
	class Tvs extends Honda{
		void stop(){
			System.out.println("stop tvs");
	}
	}
	  class TestAbstraction3{  
	 public static void main(String args[]){  
	  Bike obj = new Hero();  
	 obj.run();  
	 obj.changeGear(); 
	 obj.stop();
	 Tvs obj1=new Tvs();
	 obj1.run();
	 obj1.changeGear();
	 obj1.stop();
	 }  
	}  

