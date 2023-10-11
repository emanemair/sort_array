import java.util.*; 

public class MyClass{

    public static void insertionSort(int arr[])
    {
        int i  , j , key ; 
        int n = arr.length; 
        for (i=1 ; i < n ; i++)
        {
            key=arr[i];
            j=i-1; 
            while (j>=0&& arr[j]>key)
            {
                arr[j+1] = arr[j]; 
                j=j-1; 
            }
            arr[j+1] = key ; 
        }
    }
    public static void main (String args[])
    {

    }
}