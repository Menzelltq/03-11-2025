package Tesukl.soalkeduau;
import java.util.Scanner;
public class soalkeduaukk {
        Scanner input = new Scanner(System.in);

        void tabung(){
            System.out.print("Masukkan jari-jari alas tabung: ");
            double r = input.nextDouble();
            System.out.print("Masukkan tinggi tabung: ");
            double t = input.nextDouble();
            double volume = Math.PI * r * r * t;
            System.out.println("Volume tabung adalah: " + volume);
        }

        public static void main(String[] args) {
            soalkeduaukk tabung = new soalkeduaukk();
            tabung.tabung();
        }
    
}
