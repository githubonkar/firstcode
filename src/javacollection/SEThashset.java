package javacollection;

import java.util.HashSet;
import java.util.Iterator;

public class SEThashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet hs = new HashSet();
       hs.add("onkar");
       hs.add("onkar");
       hs.add("123");
       hs.add("@omionkar");
       System.out.println(hs);
       HashSet hs2 = new HashSet();
       hs2.add("onkar");
       hs2.add("retain");
       hs2.add("union");
      // System.out.println(hs2.contains(null));
       //hs2.add(null);
      // hs2.remove("123");
       hs2.addAll(hs);
       System.out.println(hs2);//******union of set
      hs2.retainAll(hs);//******intersection of set
      // hs2.removeAll(hs);
       System.out.println(hs2);
       
       //System.out.println(hs.size());
       // Iterator itr=hs2.iterator();
       // while(itr.hasNext()) { System.out.println("from itrator"+itr.next());}
         //hs2.removeAll(hs2);
       // System.out.println(hs2.isEmpty());
        
       
	}

}
