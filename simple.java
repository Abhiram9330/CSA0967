import java.io.*;
import java.util.*;
 

class simple
{
  public static void main(String[] args)
  {
   int amt,years,roi,intrst;
   char csc;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter amount and number of years");
   amt=sc.nextInt();
   years=sc.nextInt();
   roi=12;
   intrst=(amt*years*roi)/100;
   System.out.println("simple intrest is "+intrst);
  }
}