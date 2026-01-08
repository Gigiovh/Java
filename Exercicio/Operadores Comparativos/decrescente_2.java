/******************************************************************************

  Faça um programa que leia três números e imprima-os em ordem decrescente (suponha números diferentes).

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
		
		if(n1>n2 && n2>n3){
		    System.out.println(" A ordem decrescente dos números é: "+n3 +n2 +n1);
		}else if(n2>n1 && n3>n1){
		     System.out.println(" A ordem decrescente dos números é: "+n1 +n3 +n2);
		}else if (n1> n2 && n2<n3){
		     System.out.println(" A ordem decrescente dos números é: "+n2 +n3 +n1);
		}else if(n2>n1 && n1>n3){
		    System.out.println(" A ordem decrescente dos números é: "+n3 +n1 +n2);
		}else if(n3>n1 && n1>n2){
		    System.out.println(" A ordem decrescente dos números é: "+n1 +n2 +n3);
		}else{
		    System.out.println(" A ordem decrescente dos números é: "+n2 +n1 +n3);
		}
	}
}
