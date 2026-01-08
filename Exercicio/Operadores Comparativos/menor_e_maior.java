/******************************************************************************
 Faça um programa que leia cinco números inteiros e identificar o maior e o menor valor.

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
		System.out.println(" Digite um número: ");
		double n4= entrada.nextDouble();
		System.out.println(" Digite um número: ");
		double n5= entrada.nextDouble();
		
		if(n1>n2 && n1>n3 && n1>n4 && n1>n5 && n2<n3 && n2<n4 && n2<n5){
		   double maior= n1;
		    double menor=n2;
		}
		    else if(n1>n2 && n1>n3 && n1>n4 && n1>n5 && n2>n3 && n3<n4 && n3<n5){
		   double maior= n1;
		    double menor=n3;
		    
		   }else  if(n1>n2 && n1>n3 && n1>n4 && n1>n5 && n4<n3 && n2>n4 && n4<n5){
		   double maior= n1;
		    double menor=n4;
		    
		   }else if(n1>n2 && n1>n3 && n1>n4 && n1>n5 && n5<n3 && n5<n4 && n2>n5){
		   double maior= n1;
		    double menor=n5;
		    
		}else if(n2>n1 && n2>n3&& n2>n4 && n2>n5 && n1<n3 && n1<n4 && n1<n5){
		       double maior= n2;
		    double menor=n1;
		    
		}else if(n2>n1 && n2>n3&& n2>n4 && n2>n5 && n3<n3 && n3<n4 && n3<n5){
		       double maior= n2;
		    double menor=n3;
		    
		}else if(n2>n1 && n2>n3&& n2>n4 && n2>n5 && n4<n3 && n1>n4 && n4<n5){
		       double maior= n2;
		    double menor=n4;
		    
		}else if(n2>n1 && n2>n3&& n2>n4 && n2>n5 && n5<n3 && n5<n4 && n1>n5){
		       double maior= n2;
		    double menor=n5;
		     
		}else if (n3> n2 && n3<n1 && n3>n4 && n3>n5 && n1<n2 && n1<n4 && n1<n5){

		        double maior= n3;
		    double menor=n1;
		    
		}else if (n3> n2 && n3<n1 && n3>n4 && n3>n5 && n1>n2 && n2<n4 && n2<n5){

		        double maior= n3;
		    double menor=n2;
		    
		}else if (n3> n2 && n3<n1 && n3>n4 && n3>n5 && n4<n2 && n1>n4 && n4<n5){

		        double maior= n3;
		    double menor=n4;
		    
		}else if (n3> n2 && n3<n1 && n3>n4 && n3>n5 && n5<n2 && n5<n4 && n1>n5){

		        double maior= n3;
		    double menor=n5;
		      
		    
		}else if(n4>n1 && n4>n3 && n4>n5 && n4>n2 && n1<n3 && n1<n2 && n1<n5){
		  
		       double maior= n4;
		    double menor=n1;
		    
		}else if(n4>n1 && n4>n3 && n4>n5 && n4>n2 && n2<n3 && n1>n2 && n2<n5){
		  
		       double maior= n4;
		    double menor=n2;
		    
		}else if(n4>n1 && n4>n3 && n4>n5 && n4>n2 && n1>n3 && n3<n2 && n3<n5){
		  
		       double maior= n4;
		    double menor=n3;
		    
		}else if(n4>n1 && n4>n3 && n4>n5 && n4>n2 && n5<n3 && n5<n2 && n1>n5){
		  
		       double maior= n4;
		    double menor=n5;
		    
		}else if(n5>n1 && n5>n2&& n5>n3&& n5>n4 && n1<n2 && n1<n3 && n1<n4){

		       double maior= n5;
		    double menor=n1;
		    
		}else if(n5>n1 && n5>n2&& n5>n3&& n5>n4 && n1>n2 && n2<n3 && n2<n4){

		       double maior= n5;
		    double menor=n2;
		    
		}else if(n5>n1 && n5>n2&& n5>n3&& n5>n4 && n3<n2 && n1>n3 && n3<n4){

		       double maior= n5;
		    double menor=n3;
		    
		}else{
		    
		       double maior= n5;
		    double menor=n4;
		}
	}
}
