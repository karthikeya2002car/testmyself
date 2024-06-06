package Strings;
import java.util.Scanner;;
public class MaxStrOcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                { 
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' ') 
            {
            //pending.....
            }
        }
        
    }
}
