package Strings.Practice;

public class HalooTri {
    public static void main(String[] args) {
        int n=9;
        int space=0;
        int star=n-1;
        for(int i=0;i<=n/2;i++){

            for(int k=0;k<space;k++)
                  {
                    System.out.print(" "+" ");
                  }

             for(int k=0;k<n;k++){
                  if(i==0||k==0||k==star) System.out.print("*"+" ");
                   else System.out.print(" "+" ");
             }

star=star-2 ;space++;System.out.println();

        }
    }
}
