package Searching;
import java.util.*;
// Condition for binary search is that array must be sorted!
public class BinarySearch{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int i,n,key,x;
        int arr[] = new int[10];
        n = sc.nextInt();
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        key = sc.nextInt();
        x = binarySearch(arr, key);
        if (x== -1){
            System.out.println("Element not found");
        }
        else{
        System.out.println("Element found at index "+x);
    }
    sc.close();
    }
    public static int binarySearch(int[] arr, int key){
        int start,end,mid;
        start = 0;
        end = arr.length-1;
        while(start <= end){
            mid = start + ((end-start)/2);
            if(arr[mid] == key){
             return mid;
            }
            if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}