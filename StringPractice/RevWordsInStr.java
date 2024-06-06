package StringPractice;
class RevWordInStr
{
    public static void main(String[] args) {
        String s1="aaabbccd";
        char[] ch=s1.toCharArray();
        int i=0;
        String s2=" ";
        while(i<ch.length)
        {
            char c=ch[i];
            int count=1;
            i++;
            while(i<ch.length && c==ch[i])
            {
                i++;
                count++;
            }
            s2=s2+count+c;
        }
        System.out.println(s2);
}
}