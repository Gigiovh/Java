/******************************************************************************

 Elabore um programa que dada a idade de um nadador classifique-o em uma das seguintes categorias:
•	Infantil A = 5 a 7 anos
•	Infantil B = 8 a 11 anos
•	Juvenil A = 12 a 13 anos
•	Juvenil B = 14 a 17 anos
•	Adultos = Maiores de 18 anos

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ft= new Scanner(System.in);
		System.out.println(" Digite a idade do nadador: ");
		int id= ft.nextInt();
		if (id>4 && id<8){
		    System.out.println(" Infantil A ");
		} else if(id>7&& id<12){
		    System.out.println(" Infantil B ");
		} else if(id>11&& id<14){
		    System.out.println(" Juvenil A ");
		} else if(id>13&& id<18){
		    System.out.println(" Juvenil B ");
		} else {
		    System.out.println(" Adultos  ");
		}
	}
}
