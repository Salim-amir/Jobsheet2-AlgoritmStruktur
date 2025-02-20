public class MataKuliahMain16 {
    public static void main(String[] args) {
        MataKuliah16 mk1 = new MataKuliah16();
        mk1.tampilInformasi();
        System.out.println("===============================================");
     
        mk1.ubahSKS(4);
        
        mk1.tambahJam(4);
        
        mk1.kurangiJam(2);
        System.out.println("===============================================");
        mk1.tampilInformasi();
    }
}