/******************************************************************************
21)	 Faça um programa que leia dois números e imprima-os em ordem decrescente (suponha números diferentes).


*******************************************************************************/

import java.util.Scanner;
public class Main
{
   public static void main(String[]args){
    Scanner decrescente= new Scanner(System.in);
    System.out.println(" Digite um número: ");
    double n1= decrescente.nextDouble();
    System.out.println( " Digite outro número: ");
    double n2= decrescente.nextDouble();
    if(n1<n2){
        System.out.println(" A ordem decrescente dos números é: "+n1 +n2);
    }else if (n2>n1){
        System.out.println(" A ordem decrescente dos números é: "+n2 +n1);
    }else{
    System.out.println(" INVÁLIDO ");
   }
}
}
