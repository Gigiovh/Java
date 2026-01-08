/******************************************************************************

19)	 Faça um programa que leia dois números e imprima o menor número (suponha números diferentes).
*******************************************************************************/

import java.util.Scanner;
public class Main
{
public static void main(String[]args){
Scanner entrada=new Scanner(System.in);
System.out.println(" Digite um número ");
double n1=entrada.nextDouble();
System.out.println(" Digite um número ");
double n2=entrada.nextDouble();
if(n1>n2){
System.out.println(" O menor número é: "+n2);
}else{
System.out.println(" O menor número é: "+n1);
}
}
}
