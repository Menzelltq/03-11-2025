package Tesukl.soalketigau;
import java.util.Scanner;

public class soalketigaukk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan jumlah baris matriks pertama: ");
            int baris1 = input.nextInt();
            System.out.print("Masukkan jumlah kolom matriks pertama: ");
            int kolom1 = input.nextInt();

            int[][] matriks1 = new int[baris1][kolom1];
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom1; j++) {
                    System.out.print("Masukkan elemen matriks pertama baris " + (i+1) + " kolom " + (j+1) + ": ");
                    matriks1[i][j] = input.nextInt();
                }
            }

            System.out.print("Masukkan jumlah baris matriks kedua: ");
            int baris2 = input.nextInt();
            System.out.print("Masukkan jumlah kolom matriks kedua: ");
            int kolom2 = input.nextInt();

            int[][] matriks2 = new int[baris2][kolom2];
            for (int k = 0; k < baris2; k++) {
                for (int l = 0; l < kolom2; l++) {
                    System.out.print("Masukkan elemen matriks kedua baris " + (k+1) + " kolom " + (l+1) + ": ");
                    matriks2[k][l] = input.nextInt();
                }
            }

            if (baris1 == baris2 && kolom1 == kolom2) {
                System.out.println("Hasil penjumlahan matriks:");
                int[][] hasil = new int[baris1][kolom1];
                for (int m = 0; m < baris1; m++) {
                    for (int n = 0; n < kolom1; n++) {
                        hasil[m][n] = matriks1[m][n] + matriks2[m][n];
                    }
                }

                for (int o = 0; o < baris1; o++) {
                    for (int p = 0; p < kolom1; p++) {
                        System.out.print(hasil[o][p] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Matriks tidak dapat dijumlahkan (dimensi berbeda).");
            }
        } finally {
            input.close();
        }
    }
}