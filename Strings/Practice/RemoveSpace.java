package Strings.Practice;

public class RemoveSpace {//try by adding space at firsta dn last without using trim()..!!
    public static void main(String[] args) {
        String s="java             is                              easy",s1="";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ')
            {
                s1+=ch[i];
            }
            else if(ch[i+1]!=' ')
            {
                s1+=" ";
                continue;
            }
        }
        System.out.println(s1);
         
        
    }
}
