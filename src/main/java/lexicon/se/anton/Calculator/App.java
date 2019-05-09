package lexicon.se.anton.Calculator;

import java.util.Scanner;
public class App 
{
	public class Calculator 
	{
		double firstNumb;
		double secondNumb;
		
		Calculator(double firstNumb, double secondNumb)
		{
			this.firstNumb = firstNumb;
			this.secondNumb = secondNumb;
		}
		double add()
		{
			return firstNumb + secondNumb;
		}
		double sub()
		{
			return firstNumb - secondNumb;
		}
		double div()
		{
			return firstNumb / secondNumb;
		}
		double mul()
		{
			return firstNumb * secondNumb;
		}
	}
	
    public static void main( String[] args )
    { 
       Scanner sr = new Scanner(System.in);
       char cont = 'y';
       String input;
       
       System.out.println("Hi and welcome to the basic calculator!");
       while (cont != 'n')
       {
         
       System.out.println("Please input a number: ");
       double firstNumb = sr.nextDouble();
       
       System.out.println("Please input a second number: ");
       double secondNumb = sr.nextDouble();
       
       System.out.println("Which operator do you want to use? (+,-,/,*): ");
       String op = sr.next();
       
       double sum = 0;
       Calculator obj = new App().new Calculator(firstNumb, secondNumb);
       switch(op)
       {
       case "+": sum = obj.add(); break;
       case "-": sum = obj.sub(); break;
       case "/": sum = obj.div(); break;
       case "*": sum = obj.mul(); break;
       default: System.out.println("Error:");
       }	
       
       System.out.println("Your result: " + firstNumb + " " + op + " " + secondNumb + " = " + sum);
       
       System.out.println("Do you want to continue? Choose y/n");
       input = sr.next().toLowerCase();
       cont = input.charAt(0);
       
       if (cont == 'y')
       {
         System.out.println("Welcome back!");
       }
       }
    }
}
