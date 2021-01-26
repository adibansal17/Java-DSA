package Searching;
import java.util.*;

public class LinearSearch{
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);
        int n,i,search;
        int arr[] = new int[10];
        n = sc.nextInt();
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        search = sc.nextInt();
        linearSearch(arr,search);
        //sc.close();
        //System.out.println("Element found at index "+x);
    }
    public static void linearSearch(int[] arr,int search){
        int i,flag=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.print("Element "+arr[i]+" is found at index "+i);
                flag=1;
                break;  
            }
        }
        if(flag==0)
        System.out.println("Element not found!");
}
}