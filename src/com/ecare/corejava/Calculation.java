package com.ecare.corejava;

//1)Example of Method Overloading by changing the no. of arguments

	class Calculation{  
		void sum(int a,long b){System.out.println("int arg method invoked");}  
			  void sum(long a,float b){System.out.println("long arg method invoked");}  
		  
		  public static void main(String args[]){  
			  Calculation obj=new Calculation();  
			  obj.sum(999999999,999999999);//now int arg sum() method gets invoked  
			  }  

		}  


