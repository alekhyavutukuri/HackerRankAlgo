import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int apts = 0;
        int bpts = 0;
        
        if(a0 > b0){ apts = 1;} else if ( a0 < b0) {bpts = 1;} 
        if(a1 > b1){ apts += 1;} else if ( a1 < b1) {bpts += 1;} 
        if(a2 > b2){ apts += 1;} else if ( a2 < b2) {bpts += 1;}
        
        System.out.println(apts +" " + bpts);
    }
}
