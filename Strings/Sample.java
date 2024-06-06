package Strings;

public class Sample {
    public static void main(String[] args) {
        
        String s1="malayalam";
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<s1.length();j++)
            {
                String s2=s1.substring(i,j+1);
                if(isPalin(s2))
                {
                    System.out.println(s2);
                }
            }
        }
        
    }
    public static boolean  isPalin(String str)
    {
        int count=0;
        char [] ch=str.toCharArray();
        int j=ch.length;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=ch[j-1]) return false;
            count++;
            j--;
        } 
        System.out.println(count);
        return true;
    }
}
