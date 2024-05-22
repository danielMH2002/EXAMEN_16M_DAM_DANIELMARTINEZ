package Daniel;

import java.util.Scanner;

public class PedirNum {
public static void main(String[] args) {
	 Scanner ent = new Scanner(System.in);
     System.out.println("Buenos días Ceinmark, soy Marta Gómez");
     
     System.out.println("Introduce un número para averiguar si es primo o no:");
     int num = ent.nextInt();
     System.out.println("Tu número es " + num);
     
     boolean esPrimo = true;
     
     if (num <= 1) {
         esPrimo = false;
     } else {
         for (int i = 2; i < num; i++) {
             if (num % i == 0) {
                 esPrimo = false;
                 break;
             }
         }
     }

     if (esPrimo) {
         System.out.println(num + " es un número primo.");
     } else {
         System.out.println(num + " no es un número primo.");
     }

}
}
