package Strings;

public class StrLowerToUpperViceVresa {
    public static void main(String[] args) {
        
        String s1="java rava ewaa neeva ";
        String s2="";
        int j=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=' ')
            {
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z')//if(s1.chartAt(i)>='A' && s1.chartAt(<='Z'))
            {
                s2=s2+(char)(s1.charAt(i)-32);//(s1.chartAt(i)+32)
                
            }
            }
            s2+=" ";
        }
        System.out.println(s2);
    }
}
