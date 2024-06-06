package Pattern_programs;

public class Rtrirev {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);//use * if you want star pattern.....
            }
            System.out.println();
        }
    }
    
}
