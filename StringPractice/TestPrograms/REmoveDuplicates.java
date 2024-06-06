package StringPractice.TestPrograms;

public class REmoveDuplicates {
    public static void main(String[] args) {
        String s1="aaabbcc";// ONLY FOR DELETIING SEQUENCE DUPLICATES...
        String s2="";
        char[] ch=s1.toCharArray();
        int i=0,j=0;
        j=i+1;
        while(i<ch.length)
        {
            char c=ch[i];//take the first value and store in a veriable...
            s2+=ch[i];//add that first veriable to string...
            while(j<ch.length)//take j value from 1st index so that oth index is compared with remeaining indexes...
            {
                if(c!=ch[j])//compare 0th index with rest of indeces if the both are not same then change i to j....
                {
                    i=j;
                    break;
                }
                else
                {
                    //System.out.println(s2);
                    s2+="";//if the both are same then until they are same replace them with empty...
                }
                j++;//increment...
                //System.out.println(s2);
            }
            i=j;//this statement is used to update the i value to end.....
        }
        System.out.println(s2);
}
}