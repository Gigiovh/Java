/******************************************************************************
Elabore um programa que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
No final do processamento imprimir o salário total e o salário excedente.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("Salário");
		
		Scanner numero= new Scanner(System.in);
		
		System.out.println(" Digite o código do funcionário: ");
		double C= numero.nextDouble();
		
		System.out.println(" Digite o número de horas trabalhadas: ");
		double N = numero.nextDouble();
		
		double sl=N*10;
		if(sl>50){
		    double E= sl-50;
		    double H= E*20;
		    double T=sl+ H;
		    System.out.println(" O salário total foi de "+T);
	          System.out.println(" O salário excedente foi: "+H);
		}else {
		    	System.out.println(" O salário total foi de "+sl);
	    System.out.println(" Não teve salário excedente");
		}
		    
	    
	}
	}
