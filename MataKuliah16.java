public class MataKuliah16 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
    public MataKuliah16() {
        this.kodeMK = "ALSD";
        this.nama = "Algoritma dan Struktur data";
        this.sks = 3;
        this.jumlahJam = 6;
    }
    
    public MataKuliah16(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    void tampilInformasi() {
        System.out.println("Kode MK\t\t: " + kodeMK);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("SKS\t\t: " + sks);
        System.out.println("Jumlah Jam\t: " + jumlahJam);
    }
    
    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi    :\t" + sks);
    }
    
    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam bertambah menjadi:\t" + jumlahJam);
    }
    

    void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berkurang menjadi:\t" + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jumlah jam tidak mencukupi.");
        }
    }
}