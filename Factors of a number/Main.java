import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   int number, i;
    Scanner sc= new Scanner(System .in);
    number = sc. nextInt();
    for(i = 1; i<=number; i++)
    {
      if( number % i == 0)
      {
        System.out.println(i);
      }
	}
}
}