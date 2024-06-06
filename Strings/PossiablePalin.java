package Strings;

public class PossiablePalin {
    public static void main(String[] args) {
        String s1="malayalam";
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+2;j<=s1.length();j++)
            {

                String str=s1.substring(i, j);
                if(isPal(str))
                {
                    System.out.println(str);
                }
            }
        }
    }
    public static boolean isPal(String s)
    {
        int j=s.length();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]!=ch[j-1]) return false;
            j--;
        }
        return true;
    }
}
