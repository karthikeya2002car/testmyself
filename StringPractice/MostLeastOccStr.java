package StringPractice;

public class MostLeastOccStr {
    public static void main(String[] args) {
        
        String s1="banana";
        int count=0;
        /*char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            count=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' ')
                {
                    System.out.println(ch[i]+" "+count);
                }
            
        }*/
       for(int i=0;i<s1.length();i++)
       {
        char k=s1.charAt(i);
        count=1;
        for(int j=i+1;j<s1.length();j++)
        {
            char s=s1.charAt(j);
            if(k==s)
            {
                count++;
                s=' ';
            }
        }
        if(k!=' ')
        {
            System.out.println(k+ " "+count);
        }
       }

    }
}
