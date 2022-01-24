package javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DEMOARRAYLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList al = new ArrayList();
al.add("omi");
al.add("omkar");
al.add("omi");
al.add("omionkar");
al.set(3, "omi");
Collections.sort(al);
System.out.println(al);

for(Object e : al) {System.out.println(e);}
Iterator it = al.iterator(); while(it.hasNext()) {System.out.println(it.next());}
System.out.println(al);
ArrayList dup = new ArrayList();
System.out.println(dup.addAll(al));
dup.clear();
System.out.println(dup.addAll(al));



}

}
