package Strings;
public class FirstCap {
    public static void main(String[] args) {
        String s1="java is easy ",s2="",s3="";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ')
            {
                s2+=ch[i];
            }
            else
            {
                s2+=" ";
                s3+=exchange(s2);
                s2="";
                
            }  
        }
         System.out.println(s3);
    }
    public static String exchange(String s)
    {
        String s1="";
        char[] ch1=s.toCharArray();
                char c=(char)(ch1[0]-32);
                ch1[0]=c;
                for(int i=0;i<ch1.length;i++)
                {
                    s1+=ch1[i];
                }
                return s1;
    }
}
