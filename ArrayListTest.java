import java.lang.*;
import java.util.*;

//Class ArraylistTest
public class ArrayListTest 
{
    public static void main(String[] args)
    {

        //Createing a ArrayList 
        ArrayList <String>  list = new ArrayList<String>();
        
        list.add("Kishan"); //Adding elements in the arraylist
        list.add("Shubham");
        list.add("Bunny");      
        list.add("Pratik");
        list.add("Niraj");
        

        //Iterating the list using iterator
        Iterator itr=list.iterator(); 
        
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());            
        }
    }
}