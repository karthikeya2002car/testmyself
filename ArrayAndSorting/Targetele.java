package ArrayAndSorting;

public class Targetele {
    public static void main(String[] args) {
        int[] a={2,4,5,1,0,8,29};
        int target=11,i=0,j=1,k=j+1,sum=0;
        while(k<a.length)
        {
            sum=a[i]+a[j]+a[k];
            if(sum-2==target || sum+2==target)
            {
                System.out.println(sum+" "+a[i]+" "+a[j]+" "+a[k]);
            }
            i++;
            j++;
            k++;
        }
    }
}