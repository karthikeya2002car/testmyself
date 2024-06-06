package Strings;

public class RreverseStr {
    public static void main(String[] args) {
        
        //reverse individual Strings.....
        String s1="java is very easy";
        String s2="";//taken an empty string..
        char[] ch=s1.toCharArray();//converted to array..
        int i=0;//declaration..
        int j=0;
        while(i<ch.length)//check wheather i is less than length or not..
        {
            while(j<ch.length && ch[j]!=' ') j++;//check wheather j is less than length or not  and j th element in ch is not spapce then inceremnt j...
            int k=j-1;
            String temp="";
            while(k>=i)
            {
                temp+=ch[k];
                k--;
            }
            s2+=temp;
            if(j<ch.length)
            {
                s2+=" ";
            }
            j++;
            i=j;
        }
        System.out.println(s2);
    }
}
