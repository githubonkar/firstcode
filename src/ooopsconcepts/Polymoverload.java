package ooopsconcepts;

public class Polymoverload extends Calloopsp1 {
	static int w = 20;
	public void test()
	{int a = 10;
	int b = 20;
	System.out.println(a+b);
	
		
	}
public void test(int a) 
{
double x = 2.12 ;
System.out.println(x);}
public void test (String x) 
{System.out.println("its sequence type ");}
public void test ( float b , int c) 
{System.out.println("its int and float sequane");
}
public void mahi()
{System.out.println("from child class");}
public void superthis() {
//this.mahi();
super.mahi();}

public static void main(String[] args  ) {
Polymoverload obj = new Polymoverload();
obj.test();
obj.test(2);
obj.test("abc");
obj.test(2.12f,2);
obj.test('c', 2);
obj.mahi();
obj.superthis();
System.out.println(obj.w=10);


}}

