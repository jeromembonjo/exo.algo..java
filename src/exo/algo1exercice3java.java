package exo;

import java.util.Scanner;

public class algo1exercice3java {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("saissiez le prix ");
        int nombre1 = scanner.nextInt();
        System.out.println("saissiez le taux de la remise  ");
        int nombre2 = scanner.nextInt();
        System.out.println(nombre1+" "+nombre2);
        int temps =nombre1;
        nombre1=nombre2;
        nombre2=temps;
        System.out.println(nombre1+" "+nombre2);
    }
}