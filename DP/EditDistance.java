// DP to find minimum number of operations to convert string 1 to String 2 
//Using Tabular Method
// Eg: CAT / MAT = 1(replacing C,M is 1 operation)

package DP;

import java.util.*;

public class EditDistance {
     public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        int res;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        res = editDist(str1, str2, str1.length(), str2.length());
        System.out.println(res);
     }  
static int min(int x,int y,int z){
    // Minimum of Three Numbers
    if(x<y && x<z){
        return x;
    }
    else if(y<x && y<z){
        return y;
    }
    else{
        return z;
    }
}
public static int editDist(String str1,String str2,int m,int n){
     // Create a new array to store results of subproblems
     int[][] dp = new int[m+1][n+1]; // including phi cases(+1)
     int i,j=0;
     for(i=0;i<=m;i++){
         for(j=0;j<=n;j++){
             if(i==0){          // if str1 is empty returns str2.length
                 dp[i][j]=j;
             }
             else if(j==0){
                 dp[i][j]=i;    // if str2 is empty returns str1.length
             }
             else if(str1.charAt(i-1)==str2.charAt(j-1)){  // if last character of both strs is same returns diagonal element number
                 dp[i][j]=dp[i-1][j-1];
             }
             else{
                 dp[i][j]=1+ min(dp[i][j-1],dp[i-1][j-1],dp[i-1][j]);  // else returns 1 + min of top, diagonal and left
             }
         }
        }
        return dp[m][n];
 } 
}
