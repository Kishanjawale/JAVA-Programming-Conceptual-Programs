import java.lang.*;
import java.util.*;

//Class LinkedListTest
public class LinkedListTest 
{
    public static void main(String[] args)
    {   
        //Createing a Linked List
        LinkedList <String> LL= new LinkedList<String>();
        LL.add("Kishan"); //Adding elements in the Linked list
        LL.add("Shubham");
        LL.add("Yash");
        LL.add("Niraj");
        LL.add("Pratik");

        //Iterating the list using iterator
        Iterator<String> itr= LL.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}