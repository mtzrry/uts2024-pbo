public class Reguler extends Pelatihan{
    // atribut

    private int durasi;
    private String jenisLevel; // basic, intermediate, advanced
    private String metodeKursus; // private atau kelompok

    // konstruktor
    public Reguler(String informasi_kode, String nama, int kuota, String nama_instruktur, double harga, int durasi, String jenisLevel, String metodeKursus) {
        super(informasi_kode, nama, kuota, nama_instruktur, harga);
        this.durasi = durasi;
        this.jenisLevel = jenisLevel;
        this.metodeKursus = metodeKursus;
    }

    //getter
    public int getDurasi() {
        return durasi;
    }
    public String getJenisLevel() {
        return jenisLevel;
    }
    public String getMetodeKursus() {
        return metodeKursus;
    }
    //setter
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    public void setJenisLevel(String jenisLevel) {
        this.jenisLevel = jenisLevel;
    }
    public void setMetodeKursus(String metodeKursus) {
        this.metodeKursus = metodeKursus;
    }
    
    //method
    @Override
    public  void  printInfo() {
        super.printInfo();
        System.out.println("Durasi: " + durasi);
        System.out.println("Jenis Level: " + jenisLevel);
        System.out.println("Metode Kursus: " + metodeKursus);
    }
    
}
