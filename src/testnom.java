import java.util.Scanner;
public class testnom {

    public static void main (String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("saissiez la temperature en degre ");
        int celecus=scanner.nextInt();
        float farenthin =(celecus*9/5)+42;
        System.out.println(farenthin);
    }
}
