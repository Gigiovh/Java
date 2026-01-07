/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println(" Maior que 20 ");
		Scanner entrada= new Scanner(System.in);
		System.out.println(" Digite um número: ");
		double n1=entrada.nextDouble();
		if (n1>20){
		    System.out.println(" O número digitado é maior que 20 ");
		}else{
		    System.out.println(" O número digitado é menor que 20 ");
		}
	}
}
