package Pattern_programs;

public class RightTri {
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++)
        {
            if(i<=5){
            for(int j=1;j<=i;j++)
            {
                /*if(j==1 | j==i | i==6)////pending.....
                {
                System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }*/
            }
        }
            if(i>5){
            for(int j=i+1;j<=10;j++)
            {
                /*if(j==i+1 | j==10 | i==10){
                System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }*/
            }
        }
            System.out.println();
        }
    }
}
