package Class;

import java.util.Scanner;

public class Class2
{

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int n;
		int suma;
		int pairs;
		int odds;
		
		pairs = 0;
		odds = 0;
		suma = 0;
		
		
		System.out.println("Insert the amount of numbes you want to enter:");
		n = sc.nextInt();
		
		System.out.println("Insert " + n + " number:");
		for(int i = 0; i < n; i++)
		{
			int a = sc.nextInt();
			suma += a;
			if (a % 2 == 0)
			{
				System.out.println("The number " + a + " is pair");
				pairs ++;
			}
			else
			{
				System.out.println("The number " + a + " isn't pair");
				odds ++;
			}
		}
		System.out.println("The amount of pair numbers is: " + pairs);
		System.out.println("The amount of odd numbers is: " + odds);
		System.out.println("The number's sum up is: " + suma);
		System.out.println("Program finished with succes");
		sc.close();

	}

}
