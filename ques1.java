import java.io.*;
import java.util.*;
class ques1
{
  public static void main(String[] args)
  {
   int i,j,row,col;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the rows");
   row=sc.nextInt();
   System.out.println("enter the colums");
   col=sc.nextInt();
   for(i=1;i<=row;i++){
      for(j=1;j<=col;j++){
         System.out.print("*");
      }
    System.out.println();
   }
  }
 }