package ArrayAndSorting;


public class MostRepeated {
    public static void main(String[] args) {
        int[] a={2,5,2,1,2};
        int i=0,j=i+1,count=1;
        while(j<a.length)
        {
            if(a[j]==a[i])
            {
                count++;
              
            }
            j++;
            System.out.println(count+"  "+a[i]);
        }
    }
}
