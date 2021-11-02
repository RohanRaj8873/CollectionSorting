package com.ty.customcomparator;

import java.util.Comparator;

public class SortUsingName implements Comparator<Student> {
	@Override
	public int compare(Student s1,Student s2) {
		return s1.name.compareTo(s2.name);
	} 

}
