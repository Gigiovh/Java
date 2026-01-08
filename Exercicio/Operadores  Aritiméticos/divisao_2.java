/******************************************************************************
 Faça um programa que leia o salário de uma pessoa e imprima o desconto do INSS segundo a tabela abaixo:
Faixa															                    Desconto
Menor ou igual a R$ 600,00										         isento
Maior que R$ 600,00 e menor ou igual a R$ 1200,00				20%
Maior que R$ 1200,00 e menor ou igual a R$ 2000,00			25%
Maior que R$ 2000,00											              30%


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("Desconto");
		
		Scanner numero= new Scanner(System.in);
		
		System.out.println(" Digite o  seu salário: ");
		double n1 = numero.nextDouble();
		double d1=(n1/100)*20;
		double d2=(n1/100)*25;
		double d3=(n1/100)*30;
		
		if(n1<=600){
		    System.out.println(" Isento do desconto ");
		}else if (n1>600 && n1<=1200){
		    System.out.println(" Desconto de:  "+d1);
		    
		}else if (n1>1200 && n1<=2000){
		System.out.println(" Desconto de: "+d2);
	}else {
	    System.out.println(" Desconto de: "+d3);
	}
	    
	}
	}
