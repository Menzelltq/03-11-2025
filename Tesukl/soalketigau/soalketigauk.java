package Tesukl.soalketigau;
import java.util.Scanner;
public class soalketigauk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah murid: ");
        double murid = input.nextDouble();
        double nilaitotal = 0;

        for (int i = 1; i <= murid; i++) {
            System.out.print("Masukkan nilai murid ke-" + i + ": ");
            double nilai = input.nextDouble();
            nilaitotal += nilai;
        }

        System.out.println("Rata-rata nilai murid adalah: " + (nilaitotal / murid));
        input.close();
    }
}
