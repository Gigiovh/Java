/******************************************************************************
 Faça um programa que leia um número e imprimir uma das mensagens: maior do que 20, é igual a 20 ou é menor do que 20.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println(" Maior que 20 ");
		Scanner entrada= new Scanner(System.in);
		System.out.println(" Digite um número: ");
		double n1=entrada.nextDouble();
		if (n1>20){
		    System.out.println(" O número digitado é maior que 20 ");
		}else if (n1<20){
		    System.out.println(" O número digitado é menor que 20 ");
		}
		else{
			  System.out.println(" O número digitado é igual a 20 ");
		}
	}
}
