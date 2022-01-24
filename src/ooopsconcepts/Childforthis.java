package ooopsconcepts;

public class Childforthis extends Demoofthisandsuper {
	public void p1() 
	{System.out.println("i am from child overrider");}
	public void test() {System.out.println("from this call child");}
	public void Ch2() 
	{super.p1();// parent class method calling in chaild class without overriding
	this.p1();
	super.test();
	this.test();}
	
	
	public static void main(String[] args) {
		
		Childforthis obj = new Childforthis ();

		obj.Ch2();
		
		
	}

}
