/******************************************************************************

Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada= new Scanner(System.in);
		System.out.println(" Digite um número: ");
		double n1= entrada.nextDouble();
		if(n1%2==0){
		    System.out.println(" O número é par ");
		}else {
		    System.out.println(" O número é ímpar ");
		}if(n1<0){
		    System.out.println(" O número é negativo ");
		}else{
		    System.out.println(" O número é positivo ");
		}
	}
}
