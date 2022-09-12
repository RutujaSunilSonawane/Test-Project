package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Employee {
	int eId;
	String eName;
	String dName;
	Employee()
	{
		
	}
	Employee(int i,String n,String d)
	{
		eId=i;
		eName=n;
		dName=d;
	}
	public String toString()
	{
		return eId+" "+eName+" "+dName;
	}

	public static void main(String[] args) {
		HashSet<Employee>s=new HashSet<>();
		s.add(new Employee(34,"ABC","Manager"));
		s.add(new Employee(23,"PQR","Technical"));
		s.add(new Employee(11,"XYZ","Manager"));
		s.add(new Employee(14,"TJX","Digital"));
		Iterator<Employee>itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
