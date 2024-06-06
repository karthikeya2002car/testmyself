package StringPractice;

public class TotalSumDidgit {
    public static void main(String[] args) {
        String s1="java30 is40 very60 easy70 ";
       int sum=0;
       String s2="";
       char[] ch=s1.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
        if(ch[i]>='0'&& ch[i]<='9')
        {
            s2+=ch[i];
        }
        else
        {
            if(s2!="")
            {
                int n=Integer.parseInt(s2);
                sum+=n;
                s2=""; 
            }
        }
       }
        System.out.println(sum);
    }
}
