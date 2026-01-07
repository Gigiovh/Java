/******************************************************************************
Faça um programa que leia um número e indique se o número digitado está compreendido entre 20 e 90 ou não.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner caneta= new Scanner(System.in);
	    
		System.out.println(" Digite um número: ");
		double n1= caneta.nextDouble();
		
		if(n1>20 || n1<90 ){
		    System.out.println(" O número está comprimido entre 20 e 90!: ");
		}else{
		    System.out.println("  O número não está comprimido entre 20 e 90!");
		}
		
	}
}
