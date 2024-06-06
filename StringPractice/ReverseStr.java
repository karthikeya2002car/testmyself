package StringPractice;

public class ReverseStr {
    public static void main(String[] args) {
        
        String s1="java is easy";
        String s2="";
        char[] ch=s1.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            s2+=ch[i];
        }
        System.out.println(s2);
    }
}
