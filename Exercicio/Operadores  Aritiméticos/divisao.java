/******************************************************************************

 Faça um programa que leia um número e informe se ele é divisível por 3 e por 5.


*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
System.out.println("coloque qualquer número");
		double n1 = scanner.nextDouble();

		
if (n1%3==0 && n1%5==0)
{
System.out.println("o número é divisivel por 3 e 5");   
}
else 
System.out.println("o número não é divisivel por 5 e 3");








}
}


