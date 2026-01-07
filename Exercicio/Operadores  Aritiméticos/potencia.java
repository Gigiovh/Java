/******************************************************************************
Desenvolva um programa que:
•	Leia 4 (quatro) números;
•	Calcule o quadrado de cada um;
•	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
•	Caso contrário, imprima os valores lidos e seus respectivos quadrados.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner caneta= new Scanner(System.in);
	    
		System.out.println(" Digite um número: ");
		double n1= caneta.nextDouble();
		System.out.println(" Digite um número: ");
		double n2= caneta.nextDouble();
		System.out.println(" Digite um número: ");
		double n3= caneta.nextDouble();
		System.out.println(" Digite um número: ");
		double n4= caneta.nextDouble();
		
		double q1= n1*n1;
		double q2=n2*n2;
		double q3=n3*n3;
		double q4=n4*n4;
		
		if(q3>1000 || q3==1000){
		    System.out.println(" O quadrado do terceiro é: "+q3);
		}else{
		    System.out.println(" O quadrado dos respectivos números são: "+q1 +q2 +q3 +q4);
		}
		
	}
}
