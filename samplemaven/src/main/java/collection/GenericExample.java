package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<String>();
		s.add("Apple");
		s.add("banana");
		s.add("orange");
		s.add("grapes");
		s.add("pineapple");
		s.add("watermelon");
		System.out.println(s);
		s.set(1, "watermelon");
		System.out.println(s);
		System.out.println(s.get(3));
		System.out.println(s.indexOf("watermelon"));
		System.out.println(s.lastIndexOf("watermelon"));
		System.out.println(s.contains("grapes"));
		s.remove(4);
		System.out.println(s);
		
		
		

	}

}
