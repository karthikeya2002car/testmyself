package StringPractice;

public class ChangeAscii {
    public static void main(String[] args) {
        String s="aaaabbbbbbbccc";
        int count=0,max=0;
        char[] ch=s.toCharArray();
        char s1=' ',s2=' ';
        for(int i=1;i<ch.length;i++)
        {
            if(ch[i]==ch[i-1])
            {
                count++;
            }
            else{
                if(count>max){
                    max=count;
                    s1=ch[i-1];
                }
                count=1;
            }
        }
        
        s2=(char)(s1-32);
        System.out.println(s2);

        
    }
}
