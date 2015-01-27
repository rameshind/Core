package hclprograms;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

 class TreeSetProgramComparator implements Comparator<Integer> {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<Integer> s=new TreeSet<Integer>(new TreeSetProgramComparator());
      s.add(23);
      s.add(24);
      s.add(20);
      s.add(19);
      System.out.println(s);
	}

	public int compare(Integer obj1, Integer obj2) {
		// TODO Auto-generated method stub
		return -obj1.compareTo(obj2);
	}

}
