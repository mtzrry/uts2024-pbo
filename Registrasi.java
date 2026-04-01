public class Registrasi {
    // atribut
    private String tglPembayaran;
    private String metodePembayaran; // transfer bank, e-wallet, kartu kredit

    private String tglRegistrasi;


    protected Pelatihan pelatihan;

    // konstruktor
    public Registrasi(String tglPembayaran, String metodePembayaran, String tglRegistrasi, Pelatihan pelatihan) {
        this.tglPembayaran = tglPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.tglRegistrasi = tglRegistrasi;
        this.pelatihan = pelatihan;
    }
    //getter
    public String getTglPembayaran() {
        return tglPembayaran;
    }
    public String getMetodePembayaran() {
        return metodePembayaran;
    }
    public String getTglRegistrasi() {
        return tglRegistrasi;
    }
    public Pelatihan getPelatihan(){
        return pelatihan;
    }
    //setter
    public void setTglPembayaran(String tglPembayaran) {
        this.tglPembayaran = tglPembayaran;
    }
    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    public void setTglRegistrasi(String tglRegistrasi) {
        this.tglRegistrasi = tglRegistrasi;
    }
    public void setPelatihan(Pelatihan pelatihan) {
        this.pelatihan = pelatihan;
    }
    

    // method 
    public void printInfo() {
        System.out.println("Tanggal Pembayaran: " + tglPembayaran);
        System.out.println("Metode Pembayaran: " + metodePembayaran);
        System.out.println("Tanggal Registrasi: " + tglRegistrasi);
        pelatihan.printInfo();
    }

}
