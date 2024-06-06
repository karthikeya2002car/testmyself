package StringPractice.TestPrograms;

public class CountChar {
    public static void main(String[] args) {
        String s1="aaaaadddbbss",s2="";
        char[] ch=s1.toCharArray();
        int count=0,i=0;
        while(i<ch.length)
        {
            char c=ch[i];
            count=1;
            i++;
            while(i<ch.length && c==ch[i])
            {
                i++;
                count++;
            }
            s2=s2+count+c;
        }
        System.out.println(s2);
    }
}
