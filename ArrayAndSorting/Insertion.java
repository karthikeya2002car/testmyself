package ArrayAndSorting;

public class Insertion {
    public static void main(String[] args) {
        int[] a={9,3,5,2,1,6};
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && key < a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int s:a)
        {
            System.out.print(s);
        }
    }
}
