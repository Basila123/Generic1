package com.bridgelabzGeneric;
import java.util.*;
public class GenericFloatMax {

    public static void main(String args[])
    {
        GenericFloatMax obj=new GenericFloatMax();
        System.out.println("Maximum of 3 floating number is:");
        System.out.println(obj.compareTo());
    }
    public float compareTo(){
        Scanner co=new Scanner(System.in);
        //reading the numbers
        System.out.println("Enter three numbers");
        float a = co.nextFloat();
        float b = co.nextFloat();
        float c=co.nextFloat();
        float temp;
        float largest;
        //comparing a and b and storing the largest number in a temp variable
        temp=a>b?a:b;
        //comparing the temp variable with c and storing the result in the variable
        largest=c>temp?c:temp;
        //prints the largest number
        return(largest);
    }
}