package Strings;

public class removeDuplicates {
    public static void main(String[] args) {
        String s="adnjchfnhgdnhgabcdefaadjhhhbbcgghjik",s1="",s2="";
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(!(s1.contains(s.charAt(i)+"")))
            {
                s1+=s.charAt(i);
            }
            else{
                
                if(s1.length()>max)
                {
                    max=s1.length();
                    System.out.println(s1);
                    for(int j=0;j<s1.length()-1;j++)
                    {
                        s2+=s1.charAt(j);
                    }
                    s1="";
                }
            }
        }
        
}
}
