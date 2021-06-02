import java.util.*;
public class peak_finding2D {
    public static void main(String[] args) {
        int a[][]= {{ 10, 8, 10, 10 },
                    { 14, 13, 12, 11 },
                    { 15, 9, 11, 21 },
                    { 16, 17, 19, 20 }};
        System.out.println(findPeak(a,4,4));
    }
    public static int max_index(int a[][],int rows,int mid,int max)
    {
        
        
        int max_idx=0;
        for(int i=0;i<rows;i++)
        {
            if (a[i][mid]>max)
            {
                max=a[i][mid];
                max_idx=i;
            }
        }
        return max_idx;

    }
    static int Max(int[][] arr, int rows,
    int mid, int max)
    {
        for (int i = 0; i < rows; i++)
    {
        if (max < arr[i][mid])
    {
        max = arr[i][mid];
    }
}
return max;
}

   
    
    public static int peak(int a[][],int rows,int col,int mid)

    {
        int max = 0;
        int max_idx = max_index(a,rows,mid,max);
        
        max=Max(a,rows,mid,max);
         
        if (mid == 0 || mid == (col-1))
            {return max;}
        if(max>=a[max_idx][mid+1] && max>=a[max_idx][mid-1] )
        {
            return max; 
        }
        if(max<a[max_idx][mid+1])
        {
            
             return peak( a, rows,col, (int)(mid + 1));
            
        }
        return peak( a, rows,col, (int)(mid - 1));
       }
    static int findPeak(int[][] arr, int rows, int columns)
    {
        return peak(arr, rows, columns, columns / 2);
    }
}
