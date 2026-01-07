/******************************************************************************
Faça um programa que leia dois números e exiba se o primeiro é divisível pelo segundo.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
public static void main(String[]args){
Scanner scann=new Scanner(System.in);
System.out.println("Digite um número");
Double n1=scann.nextDouble();
System.out.println("Digite mais um número");
Double  n2=scann.nextDouble();
if(n1/n2==0){
System.out.println("O primeiro é divisível pelo segundo");
}else {
System.out.println("O primeiro não é divisível pelo segundo");
}
}
}
