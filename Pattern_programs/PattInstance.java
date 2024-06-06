package Pattern_programs;

public class PattInstance {
    public static void main(String[] args) {
        
        int k=0;
        for(int i=5;i>=1;i--)
        {
            for(int j=k;j>=i;j--)// pending ........!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            {
                System.out.print(j+"\t");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
            k++;
        }
    }
}
