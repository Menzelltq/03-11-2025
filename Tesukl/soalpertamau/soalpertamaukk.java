package Tesukl.soalpertamau;
import java.util.Scanner;
public class soalpertamaukk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan :");
        double bilangan = input.nextDouble();

        if(bilangan == 0){
            System.out.println(bilangan + " adalah nol");
        } else if (bilangan % 2 == 1) {
            System.out.println(bilangan + " adalah bilangan ganjil");
        } else if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        }
    }
}
