package ooopsconcepts;

final class Final { // final class can't inherite 
	final void test() // can call object but not override 
	{int a = 20;
	System.out.println(a);}
	public static void main(String[] args) {
		 final int a = 10;
		Final obj = new Final ();
		obj.test();
		 
		//a =a+10;
		System.out.println(a);
	}

}
