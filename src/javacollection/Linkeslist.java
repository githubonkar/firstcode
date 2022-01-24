package javacollection;

import java.util.Collections;
import java.util.LinkedList;

public class Linkeslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList llst = new LinkedList();
llst.add("onkar");
llst.add("1025");
llst.add("@omionkar");
llst.add("omi");
llst.add("osamantha");
System.out.println(llst);// maintain insertion [onkar, 1025, @omionkar, omi, osamantha]
System.out.println(llst.size());
llst.addFirst("2.20");
System.out.println(llst);
llst.remove(3);
System.out.println(llst);
llst.set(2, "2020");
System.out.println(llst);
LinkedList demo = new LinkedList();
demo.addAll(llst);
demo.add(null);
demo.removeAll(llst);
System.out.println(demo);
System.out.println(llst);
Collections.sort(llst);
System.out.println(llst);
llst.contains("2020");
System.out.println(llst.contains("2020"));




	}

}
