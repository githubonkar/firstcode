package ooopsconcepts;

public interface Interface {
	void test();
	void test1();
	static void test3() 
	{System.out.println(" from static interface");}
static	public  void main(String[] args) {
		Interface.test3();
	}
	
	

}
