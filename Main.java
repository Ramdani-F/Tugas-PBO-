public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setNama("Persegi");
        persegi.setSisi(5);

        PersegiPanjang pp = new PersegiPanjang();
        pp.setNama("Persegi Panjang");
        pp.setPanjang(8);
        pp.setLebar(4);

        Segitiga segitiga = new Segitiga();
        segitiga.setNama("Segitiga");
        segitiga.setAlas(6);
        segitiga.setTinggi(4);
        segitiga.setSisiA(5);
        segitiga.setSisiB(5);
        segitiga.setSisiC(6);

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setNama("Lingkaran");
        lingkaran.setJariJari(7);

        BangunDatar[] daftar = {persegi, pp, segitiga, lingkaran};
        for (BangunDatar b : daftar) {
            System.out.println("Bangun Datar : " + b.getNama());
            System.out.printf("Luas         : %.2f%n", b.hitungLuas());
            System.out.printf("Keliling     : %.2f%n", b.hitungKeliling());
            System.out.println("----------------------------");
        }
    }
}
