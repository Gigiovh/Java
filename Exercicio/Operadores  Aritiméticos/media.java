/******************************************************************************
Faça um programa que leia o nome, a nota da PR1 e a nota da PR2 de 1 aluno.
Imprimir: nome, nota da PR1, nota da PR2, média aritmética e uma das mensagens: AP, RP ou PF 
(a média é 7 para aprovação (AP), menor que 3 para reprovação (RP) e as demais em prova final (PF)).

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner tati= new Scanner(System.in);
		System.out.println(" Escreva seu nome: ");
		String nm= tati.nextLine();
		System.out.println(" Escreva a nota da prova 1: ");
		double p1= tati.nextDouble();
		System.out.println(" Escreva a nota da prova 2:  ");
		double p2= tati.nextDouble();
		
		double Média= (p1+p2)/2;
		
		System.out.println(" O aluno(a) de nome: "+nm);
		System.out.println("  Tirou na primeira prova e na segunda: "+p1 +p2);
		System.out.println(" A média final é: " +Média);
		
		
		if(Média>6){
		    System.out.println(" AP ");
		}else if(Média<4){
		    System.out.println(" RP ");
		}
		else{
		    System.out.println(" PF "); 
		}
		
	}
}
