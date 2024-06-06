package Pattern_programs;

public class Sample {
    static int k=0;
    public static void main(String[] args) {
        
        System.out.println(add(5381));
       // m1(0,2);
    }
    static int add(int n)
    {int j=0;
        if(n<1) return n;
        int a=n%10;
        return add(n/10)+a;
        
    }
    /*static void m1(int s,int e)
    {
        int j=0;
        if(s>=e) return;
        for(int i=s;i<=e;i++)
        {
            k++;
            System.out.println("   "+s+" "+e+" itr "+k+" in-itr "+j);
            System.out.println(i);
            m1(s+1,e);
            j++;
        }
    }*/
    
}
