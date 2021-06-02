import java.util.*;
/**
 * peak_finding
 */
public class peak_finding {

    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of array");
        int n = s.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("\npeak elements:");
        peak(arr,0,arr.length);
        System.out.println();

    }
    public static void peak(int a[],int low ,int high)
    {
        int N = a.length;
        if(high-low<2)
        {
            return;
        }
        int mid = (high+low)/2;
        if(a[mid]<a[mid-1])
        {
            peak(a,0,mid-1);
        }
        else if(a[mid]<a[mid+1])
        {
            peak(a,mid+1,high);
        }
        else
        {
            System.out.println(a[mid]+" ");
        }

    }
}