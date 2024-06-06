package StringPractice.TestPrograms;

public class Anagram {
    public static void main(String[] args) {
        String s1="client";
        String s2="eintlc";
        anagram(s1,s2);
        if(true) System.out.println("anagram");
    
    }
    public static boolean anagram(String s1,String s2)
    {
        int i=0;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        while(s1.length()==s2.length()&& i<s1.length()&&i<s2.length())
        {
            char c=s1.charAt(i);
            s1=s1.replace(c+"","");
            s2=s2.replace(c+"","");
        i++;
    
    }
        if(s1.length()==0 && s2.length()==0)return true;
        return false;
    }
}
