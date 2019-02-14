import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int  sum=0, firstDigit=0, lastDigit=0;
      lastDigit=num%10;
      while(num>10)
      {
        num=num/10;
        
      }
      firstDigit=num;
      sum = firstDigit+lastDigit;
    System.out.println(+sum);
   
    }
}