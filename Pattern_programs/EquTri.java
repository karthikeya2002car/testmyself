package Pattern_programs;

public class EquTri {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                if(k==1 |i==5| k==5)
                {

                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=i-1;j>=1;j--)
            {
                if(j==5| i==5 |j==1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}    
    
}
