/******************************************************************************
 Faça um programa que leia três números e armazene-os em três variáveis com os seguintes nomes:  maior, intermediário e menor (suponha números diferentes).

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada= new Scanner(System.in);
		System.out.println(" Digite um número: ");
		double n1= entrada.nextDouble();
		System.out.println(" Digite um número: ");
		double n2= entrada.nextDouble();
		System.out.println(" Digite um número: ");
		double n3= entrada.nextDouble();
		
		if(n1>n2 && n2>n3){
		   double maior= n3;
		    double menor=n1;
		    double intermediário= n2;
		    
		}else if(n2>n1 && n3>n1){
		       double maior= n1;
		    double menor=n2;
		    double intermediário=n3;
		     
		}else if (n1> n2 && n2<n3){

		        double maior= n2;
		    double menor=n1;
		    double intermediário=n3;
		    
		}else if(n2>n1 && n1>n3){
		  
		       double maior= n3;
		    double menor=n2;
		    double intermediário=n1;
		}else if(n3>n1 && n1>n2){

		       double maior= n1;
		    double menor=n2;
		    double intermediário=n3;
		}else{
		    
		       double maior= n2;
		    double menor=n1;
		    double intermediário=n3;
		}
	}
}
F
