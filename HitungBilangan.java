//Tulis sebuah program yang membaca sejumlah bilangan bulat yang tidak ditentukan,
//menentukan berapa banyak nilai positif dan negatif yang telah dibaca, dan menghitung
//total dan rata-rata nilai input (tidak termasuk nol). Program Anda diakhiri dengan
//input 0. Tampilkan rata-rata sebagai angka floating-point. Berikut adalah contoh
//running programnya

import java.util.Scanner;

public class HitungBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bilangan;
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        int total = 0;
        int jumlahBilangan = 0;
       

        System.out.println("Masukkan bilangan bulat (0 = berhenti):");

        do {
            bilangan = scanner.nextInt();

            if (bilangan > 0) {
                jumlahPositif++;
                total += bilangan;
                jumlahBilangan++;
            } else if (bilangan < 0) {
                jumlahNegatif++;
                total += bilangan;
                jumlahBilangan++;
            }
        } while (bilangan != 0);
     
        // Menampilkan hasil dari bilangan yang di input 
        double rataRata = total / jumlahBilangan;
        System.out.println("Jumlah bilangan positif: " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif: " + jumlahNegatif);
        System.out.println("Total: " + total);
        System.out.println("Rata-rata : " + rataRata);

        scanner.close();
    }
}
