package com.ty.customcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class UserClassUsingSortingServices {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		UserClassUsingSortingServices scanner=new UserClassUsingSortingServices();
		
		HashSet<Student> hashSet=new HashSet<Student>();
		hashSet.add(new Student(10,"Ram",45,300.26));
		hashSet.add(new Student(20,"Mr.Ray",23,324));
		hashSet.add(new Student(10,"Munna",45,500.4));
		hashSet.add(new Student(5,"SiyaRam",53,300.26));
		hashSet.add(new Student(6,"Munna",35,253));
		hashSet.add(new Student(15,"RamaDhir",65,425));
		String s;
		ArrayList<Student> arrayList=new ArrayList<Student>(hashSet);
		
		do {
			System.out.println("Enter 1 for Sort By id");
			System.out.println("Enter 2 for Sort By name");
			System.out.println("Enter 3 for Sort By age");
			System.out.println("Enter 4 for Sort By marks");
			int n=scanner.sc.nextInt();
		if(n>0 && n<5) {
			switch(n) {
			case 1:
				Collections.sort(arrayList, new SortUsingId());
				System.out.println(arrayList);
				break;
			case 2:
				Collections.sort(arrayList, new SortUsingName());
				System.out.println(arrayList);
				break;
			case 3:
				Collections.sort(arrayList, new SortUsingAge());
				System.out.println(arrayList);
				break;
			case 4:
				Collections.sort(arrayList, new SortUsingMarks());
				System.out.println(arrayList);
				break;	
			}
		}
		else {
			System.out.println("invalid input");
		}
		System.out.println("Would you like to choose another feilds for sorting ");
		 s=scanner.sc.next();

		}
		while("yes".equals(s));
	}
}

