/******************************************************************************
Programa de cálculo do valor dos peixes

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		System.out.println("Coloque o peso dos peixes:");
		int p = scanner.nextInt();
		
	int e = p-50;
	
  if (e<1) {
    e=0;
  }
  
    int m = e * 4;
  
System.out.println("João pagará:"+m+" reais porque tem:"+e+" quilos a mais");
  
  


	}
}
