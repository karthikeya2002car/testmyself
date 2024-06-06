package Pattern_programs;

public class PattN {
    public static void main(String[] args) {
        int k=4;
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==3)
                {
                    System.out.print(k);
                    k++;
                }
                else
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
