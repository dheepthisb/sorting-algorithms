/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 * 
 * 
 */

import java.io.*;
import java.util.Scanner;
public class insertion {
    
    public static void main(String[] args)
    {
        
        //Input part
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        int n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
          arr[i]=in.nextInt();  
            
        }
        int sorted_array[] = new int[n];
 
               sorted_array = insersion_sort(n,arr);
        
        System.out.println("sorted elements");
        for(int i=0;i<n;i++)
            System.out.println(sorted_array[i]);
        
        
        
    }

    private static int[] insersion_sort(int n, int[] arr) {
                       
        for(int i =1;i<n;i++)
        {
            int element = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>element)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = element;
        }
        return(arr);
    }
    
}
