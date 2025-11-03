package Tesukl.soalkeduau;
import java.util.Scanner;
public class soalkeduauk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang ke program untuk menentukan faktorial dari sebuah bilangan");
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = input.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= bilangan; i++) {
            faktorial *= i;
        }
        System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
    }
}
