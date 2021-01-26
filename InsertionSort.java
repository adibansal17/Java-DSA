package Sorting;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n,i;
        int[] arr = new int[10];
        n = sc.nextInt();
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr,n);
    }    
    public static void insertionSort(int[] arr,int n){
        int i,j,temp;
        for(i=1;i<n;i++){
            temp = arr[i];
            j = i-1;
            while( j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
