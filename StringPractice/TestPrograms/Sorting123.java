package StringPractice.TestPrograms;

public class Sorting123 {
    public static void main(String[] args) {
        String s1="a7b2cd5kmn41";
        String s2="";
        String s3="";
        String s5="";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a'&& ch[i]<='z')
            {
                s2+=ch[i];
            }
            if(ch[i]>='0'&& ch[i]<='9')
            {
                s3+=ch[i];
            }
        }
        char[] c2=s3.toCharArray();
        for(int i=c2.length-1;i>0;i--)
        {
            if(c2[i]<=c2[i-1])
            {
                char temp=c2[i];
                c2[i]=c2[i-1];
                c2[i-1]=temp;
            }
            s5+=c2[i];
        }
        String s4=s2+s5;
        System.out.println(s4);
    }
}
