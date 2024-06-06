package Strings;

public class SwapWords {
    public static void main(String[] args) {
    //java is easy....
    //easy is java.....
    String s1="love java you get win";
    String s2="";
    String [] s3=s1.split(" ");
    int j=s3.length-1;
    for(int i=0;i<=s3.length;i++)
    {
        if(i<j)
        {
        String temp=s3[i];
        s3[i]=s3[j];
        s3[j]=temp;
        j--;
        }
    }
    for(String s:s3)
    {
        System.out.print(s+" ");
    }
}
}