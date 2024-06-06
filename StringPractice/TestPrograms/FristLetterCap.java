package StringPractice.TestPrograms;

public class FristLetterCap {
    public static void main(String[] args) {
        String s1="java is oop language";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(i==0 && ch[i]!=' '||ch[i-1]==' ')
            {
            if(ch[i]>='a'&&ch[i]<='z')
            {
                ch[i]=(char)(ch[i]-32);
            }
            }
        }
        System.out.println(ch);
}
}