package Calculadora;
import java.util.Scanner;

public class Calculadora {
	public static Scanner num;
	public static Scanner num1;
	
	public static void main(String[] args) {
		num = new Scanner(System.in);
		num1 = new Scanner(System.in);
		
		int i,number,cont = 0;
		int[] numero = new int[3];
		
		for(i=0;i<3;i++) {
			System.out.print("INGRESE EL NUMERO "+(i+1)+": ");
			numero[i] = num.nextInt();
		}
		System.out.print("INGRESE EL NUMERO "+(i+1)+": ");
		number = num1.nextInt();
		
		System.out.print("");
		while(i!=number) {
			if(numero[i]!=number) {
				cont++;
			}
			
		}
		System.out.println(cont+" NUMEROS SE REPITEN ");
	}

}
