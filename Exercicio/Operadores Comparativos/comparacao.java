/******************************************************************************
22)	 Faça um programa que leia três números e imprima o maior número(suponha números diferentes).

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada= new Scanner(System.in);
		System.out.println(" Digite um número: ");
		double n1= entrada.nextDouble();
		System.out.println(" Digite um número: ");
		double n2= entrada.nextDouble();
		System.out.println(" Digite um número: ");
		double n3= entrada.nextDouble();
		
		if(n1>n2 && n1>n3){
		    System.out.println(" O maior número é: "+n1);
		}else if(n2>n1 && n2>n3){
		     System.out.println(" O maior número é: "+n2);
		}else{
		     System.out.println(" O maior número é: "+n3);
		}
	}
}
