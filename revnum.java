import java.io.*;
import java.util.*;

class revnum
{
 public static void main(String[] args)
 {
  int num,rem,rev=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  num=sc.nextInt();
  while(num!=0)
  {
    rem=num%10;
    rev=(rev*10)+rem;
    num=num/10;
  }
  System.out.println("reverse of number is "+rev);
 }
}