public class Main {
    public static void main(String[] args) {
        // public Reguler(String informasi_kode, String nama, int kuota, String nama_instruktur, double harga, int durasi, String jenisLevel, String metodeKursus) {
        Reguler reguler = new Reguler("P001", "Pemrograman Berbasis Objek", 30, "Khodijah S.kom,M,kom", 500000, 5, "Intermediate", "Kelompok");
        Reguler reguler2 = new Reguler("P002", "Analisis Strategi Algoritma", 30, "Eeng S.kom", 500000, 5, "Intermediate", "Private");

        //String informasi_kode, String nama, int kuota, String nama_instruktur, double harga, String jenisInsidental, String tanggalPelaksanaan, String diselenggarakan
        Insidental insidental = new Insidental("P003", "Pemrograman Web", 30, "Dewi S.kom", 500000, "Workshop", "2024-04-01", "Kelompok");
        Insidental insidental2 = new Insidental("P004", "Pemrograman Mobile", 30, "Dewi S.kom", 500000, "Seminar", "2024-04-02", "Private");

        Member member = new Member("2406012412041", "2024-Maret-10", "Nawaal", "1234567890", "nawaal.hanif@example.com", "081234567890");
        Member member1 = new Member("2406012412042", "2024-Maret-10", "Aisyah", "1234567890", "aisyah@example.com", "081234567891");

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
    }
}
       
