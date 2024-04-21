//(Jumlah digit dalam bilangan bulat) Tulis metode yang menghitung jumlah digit dalam
//bilangan bulat. Gunakan tajuk metode berikut :
//public static int sumDigits(long n)

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long bilangan = scanner.nextLong();
        scanner.close();

        int jumlahDigit = sumDigits(bilangan);
        System.out.println("Jumlah semua digit dalam bilangan " + bilangan + " adalah: " + jumlahDigit);
    }

    // Metode untuk menghitung jumlah semua digit dalam bilangan bulat
    public static int sumDigits(long n) {
        int jumlah = 0;

        // Melakukan iterasi sampai n menjadi 0
        while (n != 0) {
            // Mengambil digit terakhir 
            int digit = (int) (n % 10);
            // Menambahkan digit ke jumlah
            jumlah += digit;
            // Menghapus digit terakhir
            n /= 10;
        }

        return jumlah;
    }
}
