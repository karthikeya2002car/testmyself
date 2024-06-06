package StringPractice.TestPrograms;

public class Palindrome {
    public static void main(String[] args) {
        String s1="malayalam";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                String str=s1.substring(i,j+1);
            if(isPalin(str))
            {
                System.out.println(str);
            }
        }
        }
    }
    public static boolean isPalin(String str)
    {
        int j=str.length();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=ch[j-1])return false;
            j--;
        }
        return true;

    }
}
