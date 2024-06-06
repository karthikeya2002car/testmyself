package Strings.Practice;

public class ReverseType1 {
    public static void main(String[] args) {
        String s1="The current version of Java",s2="";
        //try using method..
        for(int i=0;i<s1.length();i++)
        {
            while(i<s1.length()&& s1.charAt(i)!=' ')
            {
                s2+=s1.charAt(i);
                i++;
            }
            s2+=" ";
            m1(s2);
        }
    }
    public static void m1(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        System.out.println(s1);
    }
}
