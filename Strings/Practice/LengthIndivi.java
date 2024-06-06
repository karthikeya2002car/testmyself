package Strings.Practice;

public class LengthIndivi {
    
    public static void main(String[] args) {
        String st="the current version of java";
        String s1="";
        int count=0;
        //write the code based on no.of space  (for tow wrords there is one space) formula...
        for(int i=0;i<=st.length()-1;i++)
        {
            s1="";
            while(i<st.length() && st.charAt(i)!=' ')
            {
                s1+=st.charAt(i);
                i++;
            }
            if(s1.length()>0)
            {
                System.out.println(s1+"   "+s1.length());
            }
        }
    }
    public static void m1(String s)
    {
        System.out.println(s);
    }
}
