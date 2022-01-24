package ooopsconcepts;

public class Demoofthisandsuper  {
	public void p1() // hide 
	{System.out.println(" i am from parent");} // hide 
public void test() {
	System.out.println("from test parent");
}
	
	public static void main(String[] args) {
		Demoofthisandsuper obj = new Childforthis   ();
		obj.p1();
	
	}

}
