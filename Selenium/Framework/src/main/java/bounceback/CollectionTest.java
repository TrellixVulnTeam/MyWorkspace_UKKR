package bounceback;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {
	
	public void arrayList(){
		
		ArrayList <String> name = new ArrayList<String>();
		ArrayList info = new ArrayList ();
		
		name.add("Raj");
		name.add("Mukesh");
		name.add("Derrick");
		
		info.add("RajeshKumar");
		info.add(1);
		info.add("5as");
		
		
		Iterator <String> alName = name.iterator();
		while(alName.hasNext()){
			System.out.println(alName);
		}
		
	}

	public static void main(String[] args) {
		
		CollectionTest cl = new CollectionTest();
		cl.arrayList();

	}

}
