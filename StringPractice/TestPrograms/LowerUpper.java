package StringPractice.TestPrograms;

public class LowerUpper {
    public static void main(String[] args) {
        String s1="java";
        String s2="";
        char c=' ';
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
       {
        if(ch[i]>='a'&&ch[i]<='z')
        {
         c=(char)(ch[i]-32);
         s2+=c;
        }
    }
       
       
       System.out.print(s2);
    
    }
}
