import java.util.*;
import java.math.*;
public class countsort {
    public void sort(int a[],int n)
    {
        int k =a[0];
        for(int i=0;i<n;i++)
        {
            k=Math.max(k,a[i]);

        }
        int count[] = new int[10];
    
        for(int i=0;i<n;i++)
        {
            count[a[i]]++;
        }
        for(int i=1;i<=k;i++)
        {
            count[i]+=count[i-1];
        }
        int output[] = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            output[--count[a[i]]]=output[i];
        }
        for(int i=0;i<n;i++)
        {
            a[i]=output[i];
        }
    
    }
    
}
