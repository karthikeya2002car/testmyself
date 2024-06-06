package StringPractice.TestPrograms;
import java.util.Scanner;
public class MinMaxChar {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       char min='Z',max='a';

       for(int i=0;i<s1.length();i++)
       {
        for(int j=i;j<s1.length();j++)
        {
            if(s1.charAt(i)<=s1.charAt(j) && s1.charAt(i)<=min&& s1.charAt(i)>='A')
            {
                min=s1.charAt(i);
            }
            else
            {
                if(s1.charAt(j)>=max)
                max=s1.charAt(j);
                
            }
        }
       } 
       System.out.println(min+"  "+max);
    }
}
