package ooopsconcepts;

public class Impementation implements Interface,Inter2 {
	public static void test3() {System.out.println("123");}	
	public static void main(String[] args) {
		Impementation obj= new Impementation ();
		obj.test();
		obj.test1();
		obj.test3();
		obj.method();
		
	}

	@Override
	public void test() {
		System.out.println("xyz");
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("abc");
	}

	@Override
	public void method() {
		System.out.println("from secon parent");
		
	}
	

	
		
	}

