/******************************************************************************
Faça um programa que leia um número e informar se ele é divisível por 10, ou é divisível  por 5, ou é divisível por 2 ou se não é divisível por nenhum destes.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
System.out.println("coloque qualquer número");
		double n1 = scanner.nextDouble();

		
if (n1%10==0)
{
System.out.println("o número é divisivel por 10");   
}

 else if (n1%5==0)
{
System.out.println("o número é divisivel por 5");   
}


else if (n1%2==0)
{
System.out.println("o número é divisivel por 2");   
}

else 
System.out.println("o número não é divisivel por 10, 5 e 2");








}
}


