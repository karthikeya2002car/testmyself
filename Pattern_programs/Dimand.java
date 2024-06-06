package Pattern_programs;

public class Dimand {
    public static void main(String[] args) {
        
        for(int i=0;i<=10;i++)
        {
            if(i<=5){
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1 | j==i |i==6){
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=i+1;j>=1;j--)
            {
                if(j==1 | j==i | i==6 ){
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
        if(i>5)
        {
            for(int j=5;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i+1;j<=10;j++)
            {
                System.out.print("*");
            }
            for(int j=10;j>=i;j--)
            {
                System.out.print("*");
            }
        }
            System.out.println();
        }
    }
}
