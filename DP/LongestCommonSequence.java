// Find the longest sequence in two strings must be in order but occuring simultaneously doesnt matters.
// Tabular Approach
// Eg : abcabba / cbabaca = 4
package DP;
import java.util.*;
public class LongestCommonSequence{
    public static void main(String[] args) {
       // Driver code
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        int res;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        res = Lcs(str1, str2, str1.length(), str2.length());
        System.out.println(res);
    }
    static int max(int x,int y){
        // Maximum of two integers 
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static int Lcs(String str1,String str2,int m,int n){

        int[][] dp = new int[m+1][n+1]; 
        int i,j;
        for(i=0;i<=m;i++){
            for(j=0;j<=n;j++){
                if(i==0 || j==0){  // if any one string is empty returns 0
                    dp[i][j] = 0;
                }else if(str1.charAt(i-1)== str2.charAt(j-1)){  // if last character is same returns 1 + diagonal
                    dp[i][j]= 1+ dp[i-1][j-1];
                }
                else{
                    dp[i][j] = max(dp[i-1][j],dp[i][j-1]);  // else returns max of top and left
                }
            }
        }
        return dp[m][n];
    }
}