import java.lang.*;

class Base
{
    public int i;
    public int j;

    //Parametarized Constructor of Base Class
    public Base(int a,int b)
    {
        this.i=a;
        this.j=b;
    }
    public void Fun()
    {
        System.out.println("Inside Base Class --> Fun ()");
    }

}
class Derived extends Base
{

    public int x;
    public int y;
    
    //Constructor of Derived Class
    public Derived()
    {
        //Passing parameter to the Base class Constructor
        super(11, 21);
        
        System.err.println("Inside Dervied Constructor");
        
        this.x=30;
        this.y=40;
    }

    public void Sun()
    {
        System.err.println("Inside Derived -->> Sun()");
        System.out.println(super.i);
        super.Fun();
    }

}


public class SuperKeyword 
{
    public static void main(String arg[])
    {
        System.out.println("Inside Main");
        
        //Creating the object of Derived class
        Derived dobj= new Derived();
        dobj.Sun();
    }
    
}
