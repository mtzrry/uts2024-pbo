public class Pelatihan {
    // atribut
    protected String informasi_kode, nama, nama_instruktur;
    protected int kuota;
    protected double harga;
    protected static double pajak = 0.15;

    // konstruktor 
    public Pelatihan(String informasi_kode, String nama, int kuota, String nama_instruktur, double harga) {
        this.informasi_kode = informasi_kode;
        this.nama = nama;
        this.kuota = kuota;
        this.nama_instruktur = nama_instruktur;
        this.harga = harga;

    }
    //setter
    public void setInformasi_kode(String informasi_kode) {
        this.informasi_kode = informasi_kode;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKuota(int kuota) {
        this.kuota = kuota;
    }
    public void setNama_instruktur(String nama_instruktur) {
        this.nama_instruktur = nama_instruktur;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    //getter
    public String getInformasi_kode() {
        return informasi_kode;
    }
    public String getNama() {
        return nama;
    }
    public int getKuota() {
        return kuota;
    }
    public String getNama_instruktur() {
        return nama_instruktur;
    }
    public double getHarga() {
        return harga;
    }
    


    // method 
    public void printInfo() {
        System.out.println("Kode Pelatihan: " + getInformasi_kode());
        System.out.println("Nama Pelatihan: " + getNama());
        System.out.println("Kuota: " + getKuota());
        System.out.println("Nama Instruktur: " + getNama_instruktur());
        System.out.println("Harga: " + getHarga());
        System.out.println("Pajak: " + Pelatihan.pajak);
    }
}

