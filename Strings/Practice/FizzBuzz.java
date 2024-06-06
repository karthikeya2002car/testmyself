package Strings.Practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class FizzBuzz {
   /*  public static void main(String[] args) {
        String s="hii hello hii hello hello",s1="",s2="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                s1+=c;
            }
            else{
                if(!(s2.contains(s1+" ")))
                {
                    s2+=s1+" ";
                   // s1="";//(you missed something along with this)
                }
            }
        }
        System.out.println(s2);

      
}*/
/*public static void main(String[] args) {
    int[] a={1,2,1,3,2,2};
    int count=0,j=0,i=1,v=0;
    while(j<a.length)
    {
        while(i<a.length){
            if(a[j]==a[i])//COMPLETLY WRONG!!!!!
            {
                count++;
                v=a[j];
            }
            else{
                i++;
            }
        }
        j++;
    }
    System.out.println(v+"  "+count);
}*/
/*public static void main(String[] args) {
    Character ch='c';
    Integer i=0;
    System.out.println(save(ch,i));
}
public static Integer save(Character key,Integer value){
    Map<Character,Integer> m=new TreeMap();
    m.put(key,value);
    Integer v=0;
    Iterator itr=m.keySet().iterator();
    while(itr.hasNext())
    {
        if(!itr.hasNext())
        {
            Character c=(Character)itr.next();
             v=m.get(c);

        }
    }
    return v;
}*/
/*public static void main(String[] args) {
    String s="hii hello ",s1="",s2="";
    for(int i=0;i<s.length();i++)
    {
        char c=s.charAt(i);
        if(c!=' ')
        {
            s1+=c;
        }
        else{
            for(int j=s1.length()-1;j>=0;j--)
            {
                s2+=s1.charAt(j);
            }
        }
    }
    System.out.println(s2);
}*/

}

