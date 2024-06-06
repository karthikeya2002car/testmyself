package StringPractice.TestPrograms;

public class ReplaceCharWithAscii {
    public static void main(String[] args) {
        String s="aaabbbbcc",s1="";
        char c=' ';
        int i=0,j=0,count=0,max=0;
        while(i<s.length()-1){
            j=i+1;
            if(s.charAt(i)==s.charAt(j)){
                i=j;
                count++;
            }
            else{
                if(count>max)
                {
                    max=count;
                    c=s.charAt(i);
                    count=0;
                    i++;
                }
            }
        }
        for(int k=0;k<s.length();k++)
        {
            String s2="";
            s2+=c;
            if(s2.equals(s.charAt(k)+""))
            {
                int b=(int)c;
                s1+=b;
            }
            else{
                s1+=s.charAt(k);
            }
        }
        System.out.println(s1);
    }
}
