import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int s=a/100;
      int t=a%10;
      int sum=s+t;
      System.out.println(sum);
	}
}