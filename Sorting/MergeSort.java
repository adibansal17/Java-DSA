package Sorting;

import java.util.*;

public class MergeSort {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i,n;
        n =sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        arr2 = mergeSort(arr,0,n-1);
        for(i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
      }    
      public static int[] mergeSort(int[] arr, int first, int last) {
          if(first<last){
              int mid = (first+last)/2;
              mergeSort(arr, first, mid);
              mergeSort(arr, mid+1, last);
              merge(arr, first, mid, last);
          }
          return arr;
      }
      private static void merge(int[] arr, int i,int m,int j){
          int l = i;
          int r = m+1;
          int k = 0;
          int[] t = new int[arr.length-1];

          while(l<=m && r<=j){
              if(arr[l]<= arr[r]){
                  t[k]=arr[l];
                  k++;
                  l++;
              }
              else{
                  t[k]=arr[r];
                  k++;
              }
          }
      }  
}
