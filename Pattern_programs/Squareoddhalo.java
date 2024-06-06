package Pattern_programs;

public class Squareoddhalo {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i%2==0 ){
                if(j==1 |j==4){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            
                else{

                    System.out.print("*");
                    
                }
            }
            System.out.println();
        }
    }
    
}
