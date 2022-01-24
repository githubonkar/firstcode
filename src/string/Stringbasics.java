package string;

public class Stringbasics {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "mahi";// literal method
	String b = "mahi";// object method
	//{System.out.println(b);}
	//{System.out.println(a);}
	//{System.out.println(a.charAt(2));}// it define index character 
	//{System.out.println(a.codePointAt(2));}
	//{System.out.println(a.codePointCount(0, 2));}
	//{System.out.println(a.compareTo(b));}
	//{System.out.println(b.length());}// length of string
	//{System.out.println(a.toUpperCase());}
	//{System.out.println(a.toLowerCase());}
	//{System.out.println(b.isEmpty());}// it check whether string is empty or not
	//{System.out.println(b.trim());}// provide character removing spaces in string
	//{System.out.println(b.contains(a));}// indicate char sequence string is same then true , upper case and lower case same string false
	//{System.out.println(a.equals(b));}// indicate string are same or not  if yes then true 
	//{System.out.println(a.equalsIgnoreCase(b));}// if string are equal then cases are different it ignore cases and check string char and put yes
	System.out.println(a.subSequence(0, 4));
	 
	int c= a.length();
	for(int i=c-1;i>=0;i--)
	{System.out.print(a.charAt(i));}

	}

}
