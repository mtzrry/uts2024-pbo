public class Main {
    public static void main(String[] args) {
        // public Reguler(String informasi_kode, String nama, int kuota, String nama_instruktur, double harga, int durasi, String jenisLevel, String metodeKursus) {
        Reguler reguler = new Reguler("P001", "Pemrograman Berbasis Objek", 30, "Khodijah S.kom,M,kom", 500000, 5, "Intermediate", "Kelompok");
        Reguler reguler2 = new Reguler("P002", "Analisis Strategi Algoritma", 30, "Eeng S.kom", 500000, 5, "Intermediate", "Private");

        Member member = new Member("2406012412041", "2024-Maret-10", "Nawaal", "1234567890", "nawaal.hanif@example.com", "081234567890");
        

        //   public Registrasi(String tglPembayaran, String metodePembayaran, String tglRegistrasi, Pelatihan pelatihan) {
        Registrasi registrasi1 = new Registrasi("2024-Maret-10", "Transfer Bank", "2024-Maret-10", reguler);
        Registrasi registrasi2 = new Registrasi("2024-Maret-10", "Transfer Bank", "2024-Maret-10", reguler2 );
        Registrasi registrasi3 = new Registrasi("2024-Maret-10", "Transfer Bank", "2024-Maret-10", reguler2 );
        Registrasi registrasi4 = new Registrasi("2024-Maret-10", "Transfer Bank", "2024-Maret-10", reguler2 );
        

        System.out.println("");
        registrasi1.printInfo();
        registrasi2.printInfo();    
        registrasi3.printInfo();
        registrasi4.printInfo();
        System.out.println("");
        member.tambahRegistrasi(registrasi1);
        member.tambahRegistrasi(registrasi2);  
        member.tambahRegistrasi(registrasi3);
        member.tambahRegistrasi(registrasi4);




        System.out.println("Anjayy");
        member.printInfo();




        // Membuat objek Pelatihan
        //Pelatihan p = Pelatihan("P001", "Pelatihan Java", 30, "Budi", 500000);
        //p.printInfo();
    }
}
       
