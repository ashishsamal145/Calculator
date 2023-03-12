package calculator;

import java.util.Scanner;



public class Calc_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Welcome to Sample calculator");
			while(true)
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Want to use the calculator[Yes/No]");
				String option=sc.next();
				if(option.equalsIgnoreCase("yes"))
				{
					System.out.print("Enter first number: ");
					float a=sc.nextFloat();
					System.out.print("Enter second number: ");
					float b=sc.nextFloat();
					System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n0.Exit");
					System.out.print("Enter options: [0/1/2/3/4] :");
					int i=sc.nextInt();
					calc ob=new calc();
					
					switch(i)
					{
					case 0:
						System.out.println("Exiting......");
						System.exit(0);
					case 1:
						System.out.println("Addition is :"+ob.sum(a,b));
						break;
					case 2:
						System.out.println("Subtraction is :"+ob.sub(a,b));
						break;
					case 3:
						System.out.println("Multiplication is :"+ob.mul(a,b));
						break;
					case 4:
						System.out.println("Division is :"+ob.div(a,b));
						break;
					default:
						System.out.println("Run the program again and Enter correct option");
						break;
						
					}
					continue;
				}
				else if(option.equalsIgnoreCase("no"))
				{
					System.out.println("Thanks for using the calculator");
					System.exit(0);
				}
				else
				{
					System.out.println("Enter correct options");
					continue;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("You entered incorrect details..exiting the calculator");
		}
		finally
		{
			System.out.println("Thanks for using the calculator");
		}

	}

}
