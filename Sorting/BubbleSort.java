package Sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int n,i;
        n = sc.nextInt();
        int[] arr = new int[10];
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,n);
    }
    public static void bubbleSort(int[] arr, int n){
        int i,j,temp=0;
        for(i=0;i<n;i++){
            for(j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
