package Strings.Practice;

import java.util.Scanner;
//********important */
public class LengthWithoutStrMethod {
    public static void main(String[] args) {
        String s="java is easae";
        int count=0;
        Scanner sc=new Scanner(s);
        sc=sc.useDelimiter("");//inbuilt method of scanner class used to split the string.....
        while (sc.hasNext()) {
            String s1=sc.next();
            count++;
        }
        System.out.println(count);
    }
}
