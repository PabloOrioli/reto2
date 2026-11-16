package reto2;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int n1= 0;
		int n2= 0;
		do {
			System.out.println("selecciona el tipo de conversión: \n1. longitud \n2. peso \n3. temperatura \n4. volumen \n0. salir");
			n =Integer.parseInt(sc.nextLine());
			if (n == 1) {
				System.out.println(Funciones2.longitud(20));
				do {
					System.out.println("selecciona la conversión de longitud: \n1. millas a km \n2. km a millas \n0. salir");
					n1= Integer.parseInt(sc.nextLine());
					if (n1 == 1) {
						System.out.println(Funciones2.millas_km(20));
					}if (n1 == 2) {
						System.out.println(Funciones2.km_millas(20));
					}if (n1 == 0) {
						System.out.println("salir");
					}
					
				} while ((n==0));
			}if (n == 2) {
				System.out.println(Funciones1.peso(40));
				do {
					System.out.println("selecciona la conversión de peso: \n1. kg a libras \n2. libras a kg \n0. salir");
					n2 = Integer.parseInt(sc.nextLine());
					if (n2 == 1) {
						System.out.println(Funciones1.kg_libras(40));
					}if (n2 == 2) {
						System.out.println(Funciones1.libras_kg(40));
					}if (n2 == 0) {
						System.out.println("salir");
					}
					
				} while (n2 == 0);
				
			}if (n==3) {
				System.out.println(Funciones2.temperatura(25));
				
			}if (n == 4) {
				System.out.println(Funciones1.volumen(50));
			}if (n==0) {
				System.out.println("salir");
			}
			
		} while (!(n==0));
		
	}

}
