package Pattern_programs;

public class PatternTst {
    public static void main(String[] args) {
		
        int n=7;
        for(int i=1;i<=n;i++)
        {
            if(i<=n/2+1)
            {
                for(int j=n-(n-i);j>=1;j--)
                {
                    System.out.print(j+" ");
                }
            }
            else
            {
                for(int j=n-i+1;j>=1;j--)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
