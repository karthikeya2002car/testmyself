package Strings;

public class RevStr {
    public static void main(String[] args) {
        
        String s1="knowledge";
        String s2="";
        char[] ch=s1.toCharArray();
        for(int i=s1.length()/2;i<=s1.length()-1;i++)
        {
            s2+=ch[i];
        }
        for(int i=s1.length()/2-1;i>=0;i--)
        {
            s2+=ch[i];
        }
        System.out.println(s2);
    }
}
