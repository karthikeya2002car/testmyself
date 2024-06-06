package Strings;

public class AddTotalNumInStr {
    public static void main(String[] args) {
        
        String s1="Java40 Is60 Very50 Easy10 ";
        String [] s3=s1.split(" ");
        char[] ch=s1.toCharArray();
        String s2="";
        int sum=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>=48 && ch[i]<=57)
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
        String s4="";
        for(int j=0;j<s1.length();j++)
        {
            if(s1.charAt(j)>=48 && s1.charAt(j)<=57)
            {
                s4=s1.replace(s1.charAt(j),' ');//pending learn learn......
            }
            
        }
        //System.out.println(s4);
    }
}
