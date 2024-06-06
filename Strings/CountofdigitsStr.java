package Strings;

public class CountofdigitsStr {
    public static void main(String[] args) {
        
        String s1="hel l01 wo r3b d5hn brf iw7uy ry3t 4t 73";
        int count=0;
        for(int i=0;i<s1.length()-1;i++)
        {
            if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
