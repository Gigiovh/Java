/******************************************************************************

Faça um programa que leia um número e imprimir uma das mensagens: maior do que 20, é igual a 20 ou é menor do que 20.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner caneta= new Scanner(System.in);
	    
		System.out.println(" Digite um número: ");
		double n1= caneta.nextDouble();
		
		if(n1>20 ){
		    System.out.println(" É maior que 20 o número: "+n1);
		}else if(n1==20){
		    System.out.println(" É igual a 20 ");
		}else{
		    System.out.println(" É menor que 20 o número: "+n1);
		}
		
	}
}
