package Strings;

public class AddNumbersInStr {
    public static void main(String[] args) {
        
        String s1="java2 is1 very3 easy54";
        String[] s2=s1.split(" ");
        int sum=0;
        for(int i=0;i<s2.length;i++)
        {
            char[] ch=s2[i].toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                int n=ch[j];
                if(n>=48 && n<=57)
                {
                    sum+=n-48;
                }
            }
        }
        System.out.println(sum);
    }
}
