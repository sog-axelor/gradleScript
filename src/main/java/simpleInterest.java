package com.unique;

public class simpleInterest {
	
	  public int calsi(int p,int r,int n)
	  {
	  int si = (p*r*n)/100;
	  System.out.println("the simple interest is : " +si);
	  return si;
	  }
	  
	  public static void main(String[] args)
	  {
	    simpleInterest si = new simpleInterest();
	    System.out.println("----------Gradle Project---------------");
	    si.calsi(1000,2,2);
	  }
	  
}
