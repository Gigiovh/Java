/******************************************************************************

Faça um programa que leia o ano de nascimento de uma pessoa e o ano atual. Imprima a idade da pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido, isto é, é menor que o ano atual.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada= new Scanner(System.in);
		System.out.println(" Digite seu ano de nascimento: ");
		double nasc= entrada.nextDouble();
		System.out.println(" Digite o ano atual: ");
		double at= entrada.nextDouble();
		double idade= at-nasc;
		
		if(idade>0){
		    System.out.println(" Sua idade é  "+ idade);
		}else{
		    System.out.println(" INVÁLIDO ");
		}
	}
}
