package javacollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class MAPhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap MAP = new HashMap();
 MAP.put(101, "onkar");
 MAP.put(101, "onkar");// dupicates not allowed
 MAP.put("name", "word");
 MAP.put(102, "omi");
 MAP.put(103, "onkar");
 MAP.put(null, null);
 MAP.put(null, null);
 System.out.println(MAP);
 HashMap<Integer,String> ma = new HashMap<Integer,String>();
 ma.putAll(MAP);
 System.out.println(ma.remove(102));
 //ma.clear();
 MAP.replace(102, "solapur");
// System.out.println(MAP);
 for(Map.Entry ent : ma.entrySet()) {System.out.println(ent.getKey()+"="+ent.getValue());}
 Hashtable HT = new Hashtable ();
 HT.put(101, "hashtable");
 HT.put(101, "hashtable");// Duplicates not allowed 
 HT.put( 102, "omi");  // Null not allow at key  as well as in values
 
 System.out.println(HT);

 ///entery releted methods ///

	}

}
