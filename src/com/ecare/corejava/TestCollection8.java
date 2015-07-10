package com.ecare.corejava;

import java.util.*;  
class TestCollection8{  
 @SuppressWarnings("rawtypes")
public static void main(String args[]){  
   
HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  
 hm.put(100,"Amit");  
  hm.put(101,"Vijay"); 
  hm.put(103,null);
  hm.put(104,null);
 hm.put(102,"Rahul");  

 for( Map.Entry m:hm.entrySet()){  
  System.out.println(m.getKey()+" "+m.getValue());  
}  
 }  
}  
