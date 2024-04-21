//Tulis program dalam bahasa Java yang secara acak menghasilkan bilangan bulat antara
//1 dan 12 dan menampilkan nama bulan bahasa Indonesia Januari, Februari, ...,
//Desember untuk nomor 1, 2, ..., 12, yang sesuai.

import java.util.Random;

public class Bulan {
    public static void main(String[] args) {
        // Array nama bulan
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        // Menggunakan kelas Random untuk menghasilkan bilangan bulat acak 
        Random random = new Random();
        int urutanBulan = random.nextInt(12)+1 ;

        // Menampilkan nama bulan sesuai dengan urutan bulan 
        System.out.println("Bilangan bulan: " + urutanBulan);
        System.out.println("Nama bulan: " + namaBulan[urutanBulan - 1]);
    }
}
