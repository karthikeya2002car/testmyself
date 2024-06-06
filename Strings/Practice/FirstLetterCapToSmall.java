package Strings.Practice;

public class FirstLetterCapToSmall {
    
    //take individual item and store it in variable and take the 0th index of that variable and subtract by 32...
    public static void main(String[] args) {
        String s1="the current version of java",s2="";
        for(int i=0;i<s1.length();i++)
        {
            while(i<s1.length() && s1.charAt(i)!=' ')
            {
                s2+=s1.charAt(i);
                i++;
            }
            //s2+=" ";
            m1(s2);
        }
    } 
    public static void m1(String s)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            
        }
        
    }
}
