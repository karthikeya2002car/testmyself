package Strings;

public class CountVowelsAndConson {
    public static void main(String[] args) {
        String s1="appaleAAA";
        String s2=s1.toLowerCase();
        char[] ch=s2.toCharArray();
        int vowel=0,consonent=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
                if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='o' ||ch[i]=='i' ||ch[i]=='u')
                {
                    vowel++;
                }
                else
                {
                    consonent++;
                }
            }
        }
        System.out.println(vowel+"    "+consonent);
    }
}
//13 factorial...