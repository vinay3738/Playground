import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int i=(a%100)/10;
      int k=a%10;
      System.out.println(i);
	}
}