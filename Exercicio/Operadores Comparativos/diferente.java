/******************************************************************************
 Faça um programa que leia dois números e imprima uma mensagem dizendo se são iguais ou diferentes.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
public static void main(String[]args){
Scanner scann=new Scanner(System.in);
System.out.println("Digite um número");
double n1=scann.nextDouble();
System.out.println("Digite mais um número");
double n2=scann.nextDouble();
System.out.println("Digite mais um número");
if(n1!=n2){
System.out.println("Os números são diferentes");
}
else{
System.out.println("Os números são iguais");
}
}
}
