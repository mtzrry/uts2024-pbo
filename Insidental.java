public class Insidental extends Pelatihan{
    // atribut
    protected String jenisInsidental; // seminar, workshop, konferensi
    protected String tanggalPelaksanaan;
    protected String diselenggarakan; //online atau offline
     
    // konstruktor
    public Insidental(String informasi_kode, String nama, int kuota, String nama_instruktur, double harga, String jenisInsidental, String tanggalPelaksanaan, String diselenggarakan) {
        super(informasi_kode, nama, kuota, nama_instruktur, harga);
        this.jenisInsidental = jenisInsidental;
        this.tanggalPelaksanaan = tanggalPelaksanaan;
        this.diselenggarakan = diselenggarakan;
    }

    // method
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis Insidental: " + jenisInsidental);
        System.out.println("Tanggal Pelaksanaan: " + tanggalPelaksanaan);
        System.out.println("Diselenggarakan: " + diselenggarakan);
    }
    
}
