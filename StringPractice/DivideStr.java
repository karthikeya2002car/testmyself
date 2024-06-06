package StringPractice;

public class DivideStr {
    
    public static void main(String[] args) {
        
        String s1="knowledge";
        String s2="";
        char[] ch=s1.toCharArray();
        for(int i=ch.length/2;i<ch.length;i++)
        {
            s2+=ch[i];
        }
        for(int i=ch.length/2-1;i>=0;i--)
        {
            s2+=ch[i];
        }
        System.out.println(s2);
    }
}
