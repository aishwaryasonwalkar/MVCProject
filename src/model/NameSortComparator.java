package model;

import java.util.Comparator;

public class NameSortComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		return ((Employee) o1).getName().compareTo(((Employee) o2).getName());
	}

}
