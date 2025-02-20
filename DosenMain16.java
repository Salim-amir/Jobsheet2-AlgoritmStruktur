public class DosenMain16 {
    public static void main(String[] args) {
        Dosen16 dosen1 = new Dosen16("D001", "Dr. Budi Santoso", true, 2010, "Pemrograman Java");

        Dosen16 dosen2 = new Dosen16();
        dosen2.idDosen = "D002";
        dosen2.nama = "Dr. Siti Aminah";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 2015;
        dosen2.bidangKeahlian = "Database";

        System.out.println("=== INFORMASI DOSEN SEBELUM PERUBAHAN ===");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(true);

        dosen1.ubahKeahlian("Machine Learning");

        int tahunSekarang = 2025;
        System.out.println("Masa kerja " + dosen1.nama + " adalah " + dosen1.hitungMasaKerja(tahunSekarang) + " tahun.");
        System.out.println("Masa kerja " + dosen2.nama + " adalah " + dosen2.hitungMasaKerja(tahunSekarang) + " tahun.");
        
        System.out.println("\n=== INFORMASI DOSEN SETELAH PERUBAHAN ===");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();
    }
}
