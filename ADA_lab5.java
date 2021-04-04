import java.util.*;
import java.lang.*;
import java.io.*;
class ADA_lab5{

	
        
      static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1);  
        for (int j=low; j<high; j++) 
        { 
             
            if (arr[j] < pivot) 
            { 
                i++; 
  
                 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
         
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    
    static void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            
            int pi = partition(arr, low, high); 
  
            
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  


	public static void main(String[] args) {

		 int arr[] = new int[7];
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt();
         }
         sort(arr,0,arr.length - 1);

		  


		 int n = arr.length; 
        for (int i = 0; i < n; ++i) 
        {
            System.out.print(arr[i] + " ");
        }






	}
}