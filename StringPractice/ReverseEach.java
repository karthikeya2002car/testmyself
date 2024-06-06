package StringPractice;

import java.util.Arrays;

public class ReverseEach {
    public static void main(String[] args) {
        String s1="java is easy";
        char[] ch=s1.toCharArray();
        String s2="";
         String temp="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ')
            {
                temp+=ch[i];
            }
        }
                for(int j=temp.length()+1;j>=0;j--)
                {
                    System.out.print(s1.charAt(j));
                }
       // System.out.println(s2);
    }
}
