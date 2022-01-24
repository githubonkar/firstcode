package ooopsconcepts;

public class Concreatclass extends Abstractdemo {
	public void no () 
    {System.out.println("i am overrider");}
public void demo() {System.out.println("from concreate");}
public void test() {System.out.println("test from concreate");}
	public static void main(String[] args) {
		Concreatclass obj= new Concreatclass();
		//obj.nobody();
		obj.demo();
		obj.demo2();
		obj.test();
	
		
	}
	
	//@Override
	//public void nobody() {
		//System.out.println(" i m a rider");
		// TODO Auto-generated method stub
	@Override
	public void demo2() {
		System.out.println(" call from demo2");
		
	}
		
	}


