package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Student {
	int  id;
	String name;
	int phy;
	int chem;
	Student(int id,String name,int phy,int chem)
	{
		this.id=id;
		this.name=name;
		this.phy=phy;
		this.chem=chem;
	}
	public String toString()
	{
		return id+" "+name+" "+phy+" "+chem;
		
	}

	public static void main(String[] args) {
		ArrayList<Student>s=new ArrayList<>();
		s.add(new Student(101,"Rutuja",0,90));
		s.add(new Student(102,"Vaishnavi",0,76));
		s.add(new Student(103,"Ovi",0,89));
		System.out.println(s);
		ArrayList<Student>s2=new ArrayList<>();
		s2.add(new Student(101,"Rutuja",79,0));
		s2.add(new Student(102,"Vaishnavi",89,0));
		s2.add(new Student(103,"Ovi",67,0));
		System.out.println(s2);
		HashSet<Student>set=new HashSet<>(s );
		s.addAll(s2);
		System.out.println(s);
		
		
		

	}

}
