/******************************************************************************
 A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente.
 O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades,
 se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5
 todos os grupos devem ser notificados a paralisarem suas atividades. Faça um programa que leia 
 o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scann= new Scanner(System.in);
		System.out.println(" Digite o índice de poluição da empresa: ");
		double id= scann.nextDouble();
		if (id>0.04 && id<0.26){
		    System.out.println(" Aceitável");
		} else if(id>0.2&& id<0.4){
		    System.out.println(" As empresas do primeiro grupo devem parar suas atividades ");
		} else if(id>0.3&& id<0.5){
		    System.out.println("As empresas do primeiro e segundo devem parar suas atividades  ");
		} else {
		    System.out.println(" As empresas de todos os grupos devem parar suas atividades ");
		}
	}
}
