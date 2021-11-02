package com.ty.customcomparator;

import java.util.Comparator;

public class SortUsingMarks implements Comparator<Student> {
	@Override
	public int compare(Student s1,Student s2) {
		return (int)(s1.marks-s2.marks);
	} 

}
