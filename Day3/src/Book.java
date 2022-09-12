import java.util.Scanner;

public class Book
{
	int bid, bprice;
	String bname,authname;
	Scanner sc=new Scanner(System.in);
	public void acceptDetails()
	{
		System.out.print("Enter the Book Name::");
		bname=sc.nextLine();
		System.out.print("Enter Author Name::");
		authname=sc.nextLine();
		System.out.print("Enter Book Id::");
		bid=sc.nextInt();
		System.out.print("Enter Book Price::");
		bprice=sc.nextInt();
		
	}
	public void showDetails()
	{
		System.out.println("*****BOOK DETAILS******");
		System.out.print("Book Id::"+bid+"Book Name::"+bname+"Author Name::"+authname+"Book Price::"+bprice);
		
	}
	public void calBill()
	{
		System.out.println("*******Calculate Bill*****");
		System.out.print("Enter Quantity to Book to buy::");
		int qty=sc.nextInt();
			
				System.out.print("Total Amount to pay::"+bprice*qty);
				
				
		
	}
	public static void main(String[] args)
	{
		Book b=new Book();
		b.acceptDetails();
		b.showDetails();
		b.calBill();
		
		
	}

}
