import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    int digit;
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    while(num>100)
    {
      num=num/10;
    }
    digit=num%10;
    System.out.println(+digit);
  }}