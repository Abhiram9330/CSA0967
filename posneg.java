import java.io.*;
import java.util.*;
public class posneg
{
   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);
     int sumpos = 0,sumneg = 0,num=0,avgpos = 0,avgneg = 0,c1=0,c2=0;
     System.out.print("Number of values:");
     int p=input.nextInt();
     for(int i=1;i<=p;i++){
       System.out.print("enter the number:- ");
       num = input.nextInt();
       if(num>0){
         c1++;
         sumpos = sumpos+num;}
       else if(num<0){
         c2++;
         sumneg = sumneg-num;}
       else{
         System.out.println("enterd number invalid:-");
     }}
     avgpos=sumpos/c1;
     avgneg=sumneg/c2;
     System.out.println("the avg negative values are "+avgneg);
     System.out.println("the avg positive values are "+avgpos);
   }
}
