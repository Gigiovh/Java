/******************************************************************************
 Faça um programa que leia o nome, sexo e idade de uma pessoa. 
Se a pessoa for do sexo feminino e tiver menos que 25 anos então imprimir nome e a mensagem: ACEITA, caso contrário, imprimir nome e a mensagem: NÃO ACEITA.(considerar f e F)

*******************************************************************************/

import java.util.Scanner;
public class Main
{
    public static void main(String[]args){
    Scanner entrada= new Scanner(System.in);
    
    System.out.println(" Escreva seu nome: ");
    String nm= entrada.nextLine();
    
    System.out.println(" Escreva seu gênero, sendo F ou f para feminino e M ou m para masculino: ");
    String gn= entrada.nextLine();
    
    System.out.println(" Digite sua idade: ");
    int id= entrada.nextInt();
    
    if(gn.equals("F") && 25>id ){
        System.out.println(" ACEITA ");
        
    }else if(gn.equals("f") && 25>id){
        System.out.println(" ACEITA ");
    }else{
        System.out.println(" NÃO ACEITA ");
    }
}
}

