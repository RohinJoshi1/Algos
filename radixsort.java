import java.util.*;
import java.math.*;
public class radixsort 
{
    public void countsort(int a[],int n)
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
    

int getMax(int a[],int n)
{
    int max= a[0];
    for(int i=1;i<n;i++)
    {
        if(a[i]>max)
        {
            max=a[i];

        }
       
    }
    return max;
}

public void radixsort(int a[],int n)
{
    int m= getMax(a,n);
    for(int exp=1;m/exp>0;exp*=10)
    {
       
        {countsort((a),n);}
    }
}
}