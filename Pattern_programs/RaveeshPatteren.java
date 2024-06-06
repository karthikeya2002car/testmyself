package Pattern_programs;

public class RaveeshPatteren {
    public static void main(String[] args) {
        
         for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                if(j>i)
                {
                 System.out.print(j+"*");
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

      /*  for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                switch(j)
                {
                    case 5:if(j>i)
                    {
                    System.out.print(j+"*");
                    }
                    else
                    {
                        System.out.print(j);
                    }
                    break;
                    case 4:if(j>i)
                    {
                    System.out.print(j+"#");
                    }
                    else
                    {
                        System.out.print(j);
                    }
                    break;
                    case 3:if(j>i)
                    {
                    System.out.print(j+"$");
                    }
                    else
                    {
                        System.out.print(j);
                    }
                    break;
                    case 2:if(j>i)
                    {
                    System.out.print(j+"&");
                    }
                    else
                    {
                        System.out.print(j);
                    }
                    break;
                    case 1: if(j>i)
                    {
                    System.out.print(j+"+");
                    }
                    else
                    {
                        System.out.print(j);
                    }
                    break;
                    default: System.out.print("not");
                }  
            }
            System.out.println(); 
    }*/
}
}
