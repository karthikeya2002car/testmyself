package Strings.Practice;

public class Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int k=i/2;
            if(i==1)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
            }
                else if(i%2==0)
                {
                    for(int j=i*k+k;j>=i*k-k/2;j--)
                    {
                       System.out.print(j+" ");
                    }
                }
           else if(i%2!=0)
            {
                for(int j=i*(i-1)-(2*k+5*(k/2));j<=i*(i-1)-5*(k/2);j++)
                {
                   System.out.print(j+" ");
                }
            }
           System.out.println();
        }
    }
}
