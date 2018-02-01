import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();                
                if(a_i == a_j){ firstDiagonal += a[a_i][a_j];}
            }                       
            secondDiagonal += a[a_i][n - a_i - 1];
        }
        System.out.println(Math.abs(firstDiagonal -  secondDiagonal));
    }
}
