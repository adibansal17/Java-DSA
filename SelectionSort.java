package Sorting;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n,i;
        int[] arr=new int[10];
        n=sc.nextInt();
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,n);
  }    
  public static void selectionSort(int[] arr,int n){
      int i,j,temp,min;
      for(i=0;i<n-1;i++){
          min=i;
          for(j=i+1;j<n;j++){
              if(arr[j]<arr[min]){
                  min=j;
              }
          temp=arr[min];
          arr[min]=arr[i];
          arr[i]=temp;
          }
      }
      for(i=0;i<n;i++){
          System.out.print(arr[i]+" ");
      }
  }
}
