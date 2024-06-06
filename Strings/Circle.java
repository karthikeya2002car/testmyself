package Strings;

//toString() method............
public class Circle {
    public static void main(String[] args) {
        Test1 t1=new Test1(100);
        Test1 t2=new Test1(100);
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));
    }

}
class Test1{
        int radius;
    public Test1(int r)
    {
        this.radius=r;
    }
    @Override
    public String toString()
    {
        System.out.println(radius);
        return "Circle[radius ="+radius+"]";
    }
    @Override
    public boolean equals(Object arg)
    {
        System.out.println(arg);
        if(!(arg instanceof Test1)) return false;
        return this.radius==((Test1)arg).radius;
    }
}
