package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		s.add("black");
		s.add("blue");
		s.add("red");
		s.add("pink");
		s.add("green");
		System.out.println(s);
		Set<String> s1=new HashSet<String>();
		s1.add("violet");
		s1.add("yellow");
		s1.add("white");
		s1.add("orange");
		s.addAll(s1);
		System.out.println(s);
		//System.out.println(s1);
		System.out.println(s.contains("pink"));
		System.out.println(s.containsAll(s1));
		System.out.println(s.isEmpty());
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s1.size());
		
		
		
		

	}

}
