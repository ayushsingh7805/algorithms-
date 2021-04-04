import java.util.*;
import java.lang.*;
import java.io.*;
class ADA_lab3{

	static void selection_sort(int arr[]) 
    { 
        int n = arr.length; 
  
         
        for (int i = 0; i < n-1; i++) 
        { 
            
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                {if (arr[j] < arr[min_idx]) 
                    min_idx = j; }
  
             
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  


	public static void main(String[] args) {

		 int arr[] = {3,4,1,7,8,11,44,6};
		 selection_sort(arr);


		 int n = arr.length; 
        for (int i = 0; i < n; ++i) 
        {
            System.out.print(arr[i] + " ");
        }






	}
}