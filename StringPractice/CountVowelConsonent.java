package StringPractice;

public class CountVowelConsonent {
    public static void main(String[] args) {
        
        String s1=" java is very easy";
        int vowels=0,consonents=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>='a'&& s1.charAt(i)<='z')
            {
                if(s1.charAt(i)== 'a'||s1.charAt(i)=='e' ||s1.charAt(i)== 'i' ||s1.charAt(i)== 'o' ||s1.charAt(i)== 'u')
                {
                    vowels++;
                }
                else
                consonents++;
            }
        }
        System.out.println(vowels+" and "+consonents);
    }
}
