public class Main {
    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1.0, 1.0, 1.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas1.getLuasAlas() + 
                           ", luas selubung limas : " + limas1.getLuasSelubung() + 
                           " dan tinggi : " + limas1.getTinggi() + ". Luasnya : " + 
                           String.format("%.2f", limas1.hitungLuas()) + ", sedangkan volumenya : " + 
                           String.format("%.2f", limas1.hitungVolume()));

        LimasSegiEmpat limas2 = new LimasSegiEmpat(30.0, 40.0, 50.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas2.getLuasAlas() + 
                           ", luas selubung limas : " + limas2.getLuasSelubung() + 
                           " dan tinggi : " + limas2.getTinggi() + ". Luasnya : " + 
                           String.format("%.2f", limas2.hitungLuas()) + ", sedangkan volumenya : " + 
                           String.format("%.2f", limas2.hitungVolume()));

        LimasSegiEmpat limas3 = new LimasSegiEmpat(25.0, 35.0, 45.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas3.getLuasAlas() + 
                           ", luas selubung limas : " + limas3.getLuasSelubung() + 
                           " dan tinggi : " + limas3.getTinggi() + ". Luasnya : " + 
                           String.format("%.2f", limas3.hitungLuas()) + ", sedangkan volumenya : " + 
                           String.format("%.2f", limas3.hitungVolume()));
    }
}
