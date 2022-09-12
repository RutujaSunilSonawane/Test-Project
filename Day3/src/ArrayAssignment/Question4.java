package ArrayAssignment;
//WAP to print array itself ,don't print array in revere -I want current array reverce .Means e.g.arr[]=[3,90,45,29,37,78]so your same array must be[78,37,29,45,90,3]without using temporary array//

public class Question4

{

	static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++)
        {
            b[j - 1] = a[i];
            j = j - 1;
        }
  
        System.out.println("Reversed array is: ");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]+" ");
        }
    }
  
    public static void main(String[] args)
    {
        int [] arr = {3, 90, 45, 29, 37, 78};
        reverse(arr, arr.length);
    }

}
