import java.util.*;
public class SS 
{
    public static void selectionSort(int arr[]) 
    {
        int n=arr.length;
        for (int i=0;i<n-1;i++) 
        {
            int minIndex = i;
            for (int j=i+1;j<n;j++) {
                if(arr[j]<arr[minIndex]) 
                    minIndex = j;
            }
            int temp=arr[minIndex]; //2
            arr[minIndex]=arr[i];  //7
            arr[i]=temp; //arr[0]=2
        }
        System.out.println("After Sorting:");
        for(int i=0;i<n;i++)
        {
            if(i<n-1)
                System.out.print(arr[i]+" , ");
            else
                System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" nos. to be sorted");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        selectionSort(a);
    }
}