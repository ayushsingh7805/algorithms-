import java.util.*;
import java.lang.*;
import java.io.*;
class ADA_lab1{

	static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  


	public static void main(String[] args) {

		 int arr[] = {3,4,1,7,8,11,44,6};
		 sort(arr);


		 int n = arr.length; 
        for (int i = 0; i < n; ++i) 
        {
            System.out.print(arr[i] + " ");
        }






	}
}