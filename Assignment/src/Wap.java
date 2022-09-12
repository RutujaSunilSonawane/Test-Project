import java.util.Scanner;

public class Wap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP in java using switch case Area of Circle Area of a square Area of right angled triangle area of rectangle Circumference of a circle perimeter of a square accept //
		Scanner sc=new Scanner(System.in);
		System.out.println("MUNU:");
		System.out.println("1.Area of Circle");
		System.out.println("2.Area of Square");
		System.out.println("3.Area of right angle Triangle");
		System.out.println("4.Area of Rectangle");
		System.out.println("5.Circumference of circle");
		System.out.println("6.Perimeter of a Square");
		System.out.println("7.Exist");
			System.out.println("Enter your option:");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter redius");
				double redius=sc.nextDouble();
				double ac=3.14f*redius*redius;
				System.out.println("Area of Circle:"+ac);
				break;
			}
			case 2:
			{
				System.out.println("Enter Side");
				int side=sc.nextInt();
				int as=side*side;
				System.out.println("Area of Square:"+as);
				break;
			}
			case 3:
			{
				System.out.println("Enter the hight and base");
				double hight=sc.nextDouble();
				double base=sc.nextDouble();
				double art=0.5f*hight*base;
				System.out.println("Area of Right Angle Triangle:"+art);
				break;
				
			}
			case 4:
			{
				System.out.println("Enter the length and breadth:");
				int length=sc.nextInt();
				int breadth=sc.nextInt();
				int ar=length*breadth;
				System.out.println("Area of Rectangular:"+ar);
				break;
			}
			case 5:
			{
				System.out.println("Enter the radius");
				double R=sc.nextDouble();
				double C=3.14f*2f*R;
				System.out.println("Circumference of circle:"+C);
				break;
			}
			case 6:
			{
				System.out.println("Enter the side");
				int side=sc.nextInt();
				int P=4*side;
				System.out.println("Perimeter of square:"+P);
				break;
			}
			default:
			{
				System.out.println("exist");
				break;
			}
			}
		
		

	}

}
