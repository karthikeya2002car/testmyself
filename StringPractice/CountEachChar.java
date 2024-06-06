package StringPractice;

public class CountEachChar {
    public static void main(String[] args) {
       String s1="aabbcccddddd";
       int count=0;
       int i=0;
       String s2="";
       char[] ch=s1.toCharArray();
       while(i<ch.length)
       {
        char k=ch[i];
        count=1;
        i++;
        while(i<ch.length && k==ch[i])
        {
            count++;
            i++;
        }
        s2=s2+count+k;
       }
       System.out.println(s2);
    }
}
