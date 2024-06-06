package StringPractice.TestPrograms;

public class ReplaceStrWithoutRep {
    public static void main(String[] args) {
    String s1="abcde fghij klmno";
    char[] ch=s1.toCharArray();
    int i=0;
    while(i<ch.length)
    {
        if(ch[i]==' ')
        {
            ch[i]='0';
        }
        i++;
    }
    for(char c:ch)
    {
        System.out.print(c+" ");
    }

}
}