package exo;
import java.util.Scanner;
public class exo {

    public static void main (String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("saissiez le prix ");
        int prix=scanner.nextInt();
        System.out.println("saissiez le taux de la remise  ");
        int touxremise=scanner.nextInt();
        System.out.println("saissiez le taux de la TVA ");
        int tauxTVA=scanner.nextInt();
        float TVA =(prix*tauxTVA)/100;
        float remise=(prix*touxremise)/100;
        float total=prix+TVA-remise;
        System.out.println(prix+"  "+touxremise+" "+tauxTVA+"  "+TVA+"  "+remise+"  "+total);
    }
}