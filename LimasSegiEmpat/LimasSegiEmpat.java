class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubung;
    private double tinggi;

    public LimasSegiEmpat(double luasAlas, double luasSelubung, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubung = luasSelubung;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * luasAlas * tinggi;
    }

    public double hitungLuas() {
        return luasAlas + luasSelubung;
    }

    public double getLuasAlas() {
        return luasAlas;
    }

    public double getLuasSelubung() {
        return luasSelubung;
    }

    public double getTinggi() {
        return tinggi;
    }
}