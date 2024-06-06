package StringPractice.TestPrograms;

public class reverseEachWord {
    public static void main(String[] args) {
        String s1="java is easy ";
      // char[] ch=s1.toCharArray();
       String s2="";
       String s3="";
       /*for(int i=0;i<ch.length;i++)
       {
        s2+=ch[i];
        if(ch[i]==' ')
        {
            for(int j=s2.length()-1;j>=0;j--)
            {
                s3+=s2.charAt(j);
            }
            s2="";
        } 
       }*/
       for(int i=0;i<s1.length();i++)
       {
        s2+=s1.charAt(i);
        if(s1.charAt(i)==' ')
        {
            for(int j=s2.length()-1;j>=0;j--)
            {
                s3+=s2.charAt(j);
            }
            s2="";
        }
       }
       System.out.print(s3);
    }
    
}
