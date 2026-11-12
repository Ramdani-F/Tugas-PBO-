public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    // atribut tambahan untuk menghitung keliling
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisiA() {
        return sisiA;
    }

    public void setSisiA(double sisiA) {
        this.sisiA = sisiA;
    }

    public double getSisiB() {
        return sisiB;
    }

    public void setSisiB(double sisiB) {
        this.sisiB = sisiB;
    }

    public double getSisiC() {
        return sisiC;
    }

    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}
