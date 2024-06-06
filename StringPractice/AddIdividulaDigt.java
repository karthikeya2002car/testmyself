package StringPractice;

public class AddIdividulaDigt {
    public static void main(String[] args) {
        
        String s1="java1 is23 very34 easy9";
        int sum=0;
        String[] s2=s1.split(" ");
        for(int i=0;i<s2.length;i++)
        {
            char[] ch=s2[i].toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                if(ch[j]>='0' && ch[j]<='9')
                {
                    sum+=ch[j]-'0';
                }
            }
        }

        System.out.println(sum);

    }
}
