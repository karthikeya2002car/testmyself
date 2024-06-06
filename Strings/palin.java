package Strings;

public class palin {
    public static void main(String[] args) {
        
    
    
    String s1="malayalam";
    System.out.println(isPalin(s1));
    }
    public static boolean isPalin(String s)
    {
        int j=s.length();
        char[] a=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(a[i]!=a[j-1]) return false;
            j--;
        }
        return true;
    }
}
