package Strings;

public class ReplaceStr {
    public static void main(String[] args) {
        
        String s1="java";
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a')
            {
                s2=s2+'x';
            }
            else{
                s2=s2+s1.charAt(i);
            }
        }
        System.out.println(s2);
    }
    
}
