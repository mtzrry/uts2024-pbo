public class Peserta {
    // atribut
    private String namaPeserta, ktp, email, noTelp;
    private Registrasi[] registrasi;
    private int max_registrasi = 3;
    private int jumlahRegistrasi;

    // konstruktor
    public Peserta(String namaPeserta, String ktp, String email, String noTelp) {
        this.namaPeserta = namaPeserta;
        this.ktp = ktp;
        this.email = email;
        this.noTelp = noTelp;
        this.registrasi = new Registrasi[max_registrasi]; 
        this.jumlahRegistrasi = 0;
    }
    
    public Peserta(String namaPeserta, String ktp, String email) {
        this.namaPeserta = namaPeserta;
        this.ktp = ktp;
        this.email = email;
        this.noTelp = "Tidak ada nomor telepon"; // Default value
        this.registrasi = new Registrasi[max_registrasi]; 
        this.jumlahRegistrasi = 0;
    }

    //getter
    public int getJumlahRegistrasi() {
        return jumlahRegistrasi;
    }
    public String getNamaPeserta() {
        return namaPeserta;
    }
    public String getKtp() {
        return ktp;
    }
    public String getEmail() {
        return email;
    }
    public String getNoTelp() {
        return noTelp;
    }
    public Registrasi[] getRegistrasi() {
        return registrasi;
    }
    //setter
    public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public void tambahRegistrasi(Registrasi registrasi) {
        if (jumlahRegistrasi < max_registrasi) {
            this.registrasi[jumlahRegistrasi] = registrasi;
            jumlahRegistrasi++;
            System.out.println("Registrasi berhasil ditambahkan.");
        } else {
            System.out.println("Maaf, jumlah registrasi sudah mencapai batas maksimum.");
        }
       
    }
    public void hitungHargaAkhir() {
        double totalHarga = 0;
        for(int i = 0; i < jumlahRegistrasi; i++) {
            Pelatihan pelatihan = registrasi[i].getPelatihan();
            double hargaAwal = pelatihan.getHarga();
            double harga_pajak = hargaAwal * Pelatihan.pajak; 
            double harga_akhir = hargaAwal + harga_pajak;
           
            totalHarga += harga_akhir;
        }
         System.out.println("Harga Akhir untuk " + namaPeserta + ": " + totalHarga);

    }

    // method
    public void printInfo() {
        System.out.println("Nama Peserta: " + namaPeserta);
        System.out.println("KTP: " + ktp);
        System.out.println("Email: " + email);
        System.out.println("No. Telp: " + noTelp);
        for (int i = 0; i < jumlahRegistrasi; i++) {
            System.out.println("Registrasi " + (i + 1) + ":");
            registrasi[i].printInfo();
        }
    }
}
