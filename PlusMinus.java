import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double positiveNumbers = 0;
        double negativeNumbers = 0;
        double zeroCount = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
            if(arr[arr_i] > 0){  positiveNumbers += 1;}
            else if (arr[arr_i] < 0){ negativeNumbers += 1;}
            else {zeroCount += 1;}
        }
        
        System.out.println(positiveNumbers / n);
        System.out.println(negativeNumbers/n);
        System.out.println(zeroCount/n);
    }
}
