package Tesukl.soalpertamau;
import java.util.Scanner;
public class soalpertamauk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang ke pengantaran paket");


        System.out.println("Masukkan jarak pengantaran (KM): ");
        double jarak = input.nextDouble();
        double hargajarak;
        if ( jarak <= 10 && jarak > 0) {
            hargajarak = 4250;
        } else if (jarak > 10){
            hargajarak = 6000;
        } else {
            System.out.println("Jarak tidak valid");
            return;
        }
        System.out.println("Masukkan berat paket (KG): ");
        double berat = input.nextDouble();
        

        System.out.println("Masukkan volume paket (CM3): ");
        double volume = input.nextDouble();
        double hargavolume;
        if (volume >= 100){
            hargavolume = 50000;
        } else {
            hargavolume = 0;
        }
        double total = (hargajarak * berat) + hargavolume;
        System.out.println("Total harga pengantaran paket: " + total);
        input.close();
    }
}
