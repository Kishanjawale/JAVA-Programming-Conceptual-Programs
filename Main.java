import java.io.*;

//////////////////////////////////
//Class name: Main
//Description:This code is Just to perform Arithmetic Operations in java 
//Author:Kishan Jawale
//Date: 29/03/2022
///////////////////////////////////
 
class Main

{
    public static void main(String[] args)
    {
         //When we declare or use any variable name like iSum=0;  This is called as camel case lettering      
         //In iSum=0;   The i indicates  the data type of variable which is integer
        //and Sum indicates that it is goingto hold Sum value 
        
        
        // initializing variables
        int iNum1 = 100, iNum2 = 20, iSum = 0;
         
  
        // Displaying num1 and num2
        System.out.println("num1 = " + iNum1);
        System.out.println("num2 = " + iNum2);



        //Addition
        // adding iNum1 and iNum2
        iSum = iNum1 + iNum2;
        System.out.println("The Addtion = " + iSum);
        
        
        //Substraction
        // initializing variables
        int iSub = 0;
        // Substracting iNum1 and iNum2
        iSub = iNum1 - iNum2;
        System.out.println("The Substraction  = " + iSub);



        //Multiplication
        // initializing variables
        int iMul = 0;
        // Substracting iNum1 and iNum2
        iMul = iNum1 * iNum2;
        System.out.println("The Multiplication  = " + iMul);



        //Division
        // initializing variables
        int iDiv = 0;
        // Dividing  iNum1 and iNum2
        iDiv = iNum1 - iNum2;
        System.out.println("The Substraction  = " + iDiv);


    }
}