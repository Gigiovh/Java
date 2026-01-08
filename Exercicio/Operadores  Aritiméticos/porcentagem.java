/******************************************************************************

 Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00 caso contrário, o lucro será de 30%. Faça um programa que leia o valor do produto e imprima o valor da venda.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void main(String[]args){
    Scanner meia= new Scanner(System.in);
    
    System.out.println(" Digite o valor do produto: ");
    double vl= entrada.nextDouble();
    double p1=(vl/100)*45;
    double p2=(vl/100)*30;
    
    if(vl<20 ){
        System.out.println("O valor do produto é "+p1);
        
    }else{
        System.out.println("O valor do produto é "+p2);
    }
}
}
