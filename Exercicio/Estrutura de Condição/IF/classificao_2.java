/******************************************************************************
Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:
- não eleitor (abaixo de 16 anos)
- eleitor obrigatório ( entre 18 e 65 anos)
- eleitor facultativo ( entre 16 e 18 anos e maior de 65 anos)

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada= new Scanner(System.in);
		System.out.println(" Digite um número: ");
		double n1= entrada.nextDouble();
		
		if(n1<16){
		   System.out.println(" Não eleitor ");
		}
		    else if(n1>=18 && n1<65 ){
		   System.out.println(" Eleitor obrigatório");
		    
		    
		}else{
		    
		       System.out.println(" Eleitor facultativo ");
		}
	}
}
