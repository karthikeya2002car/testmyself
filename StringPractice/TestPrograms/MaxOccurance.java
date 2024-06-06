package StringPractice.TestPrograms;

public class MaxOccurance {
    public static void main(String[] args) {
        String s1="banana";
        int count=0;
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int k=ch[i];
            count=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(j<ch.length &&k==ch[j])
                {
                    count++;
                    ch[j]=' ';
                }
            }
                if(ch[i]!=' ')
                {
                    System.out.println(ch[i]+" "+count);
                }
            
        }

    }
}
