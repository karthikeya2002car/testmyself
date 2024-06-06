package StringPractice.TestPrograms;

public class Swaping {
    public static void main(String[] args) {
        String s1="java is oop language";
        String[] s2=s1.split(" ");
        for(int i=0;i<s2.length;i++)
        {
            String temp=s2[i];
            s2[i]=s2[i+2];
            s2[i+2]=temp;
            break;
        }
        for(String s:s2)
        {
            System.out.print(s+" ");
        }
    }
}
