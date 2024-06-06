package ArrayAndSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={9,3,6,2,1,8};
        for(int i=0;i<a.length;i++)
        {
            int index=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[index]>a[j])
                {
                    index=j;
                }
            }
            if(i!=index)
            {
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }
        }
        for(int s:a)
        {
            System.out.print(s);
        }
    }
}
