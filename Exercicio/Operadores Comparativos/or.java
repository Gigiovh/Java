/******************************************************************************
Faça um programa que leia o nome da capital do Brasil. Se a resposta estiver correta, imprimir PARABÉNS, caso contrário, ERROU. (Considerar: BRASÍLIA ou Brasília).
*******************************************************************************/

import java.util.Scanner;
public class Main
{ 
    public static void main (String[]args) {
    Scanner teste= new Scanner(System.in);
    System.out.println(" Escreva o nome da capital do Brasil ");
    String nm= teste.nextLine();
if(nm.equals("BRASÍLIA")||nm.equals("Brasília")){
    System.out.println("CORRETO");
}else{
    System.out.println("ERRADO");
}  
    
}
}
