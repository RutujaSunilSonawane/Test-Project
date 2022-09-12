package com.linkedList;

public class Book {
	int bId;
	float bPrice;
	String bName;
	Book(){
		
	}
	Book(int bId,float bPrice,String bName)
	{
		this.bId=bId;
		this.bPrice=bPrice;
		this.bName=bName;
	}
	public String toString()
	{
		return bId+" "+bPrice+" "+bName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
