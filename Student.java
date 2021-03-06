package com.ty.customcomparator;
public class Student {
	int id;
	String name;
	int age;
	double marks;
	public Student(int id, String name, int age,double marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	
	

}
