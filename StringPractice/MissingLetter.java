package StringPractice;

public class MissingLetter {
    public static void main(String[] args) {
        String s1="hella";
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>='a'&& s1.charAt(i)<='z')
            {
                char c=(char)(s1.charAt(i)-'a');
                
            }
        }
    }
}
