import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
         String[] timeArr = time.split(":");
        if(time.contains("PM")){           
            for(int i=0;i<timeArr.length;i++){
               
                if(i == 0 && "12".equals(timeArr[i])){
                   System.out.print(timeArr[i]);
               }else if(i == 0 ){
                   System.out.print(Integer.parseInt(timeArr[i])+12);
               }else if(timeArr[i].contains("PM")){
                   System.out.print(timeArr[i].replace("PM",""));
               }else{
                    System.out.print(timeArr[i]);
               }
               if(i != timeArr.length -1){
                   System.out.print(":"); 
                }
           }            
        }else{
            for(int i=0;i<timeArr.length;i++){
                if(i == 0 && "12".equals(timeArr[i])){
                   System.out.print("00");
               }else if(timeArr[i].contains("AM")){
                   System.out.print(timeArr[i].replace("AM",""));
               }else{
                    System.out.print(timeArr[i]);
               }
                if(i != timeArr.length -1){
                   System.out.print(":"); 
                }
           } 
        }
    }
}