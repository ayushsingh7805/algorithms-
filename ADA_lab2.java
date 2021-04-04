import java.util.*;
import java.lang.*;
import java.io.*;
class ADA_lab2{

	static void bubble_sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                     
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  


	public static void main(String[] args) {

		 int arr[] = {3,4,1,7,8,11,44,6};
		 bubble_sort(arr);


		 int n = arr.length; 
        for (int i = 0; i < n; ++i) 
        {
            System.out.print(arr[i] + " ");
        }






	}
}