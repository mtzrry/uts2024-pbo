public class Member extends Peserta {
    private String noAnggota;
    private String tanggalBergabung;

    static double diskon = 0.1; // 10% discount

    // konstruktor
    public Member(String noAnggota, String tanggalBergabung, String namaPeserta, String ktp, String email, String noTelp) {
        super(namaPeserta, ktp, email, noTelp);
        this.noAnggota = noAnggota;
        this.tanggalBergabung = tanggalBergabung;
    }

    //getter
    public String getNoAnggota() {
        return noAnggota;
    }
    public String getTanggalBergabung() {
        return tanggalBergabung;
    }
    //setter
    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }
    public void setTanggalBergabung(String tanggalBergabung) {
        this.tanggalBergabung = tanggalBergabung;
    }
    // method

    @Override
    public void hitungHargaAkhir() {
        double totalHarga = 0;
        
        int jumlahBeli = getJumlahRegistrasi(); 
        
        Registrasi[] daftarReg = getRegistrasi(); 

        for(int i = 0; i < jumlahBeli; i++) {
            Pelatihan pelatihan = daftarReg[i].getPelatihan();
            double hargaAwal = pelatihan.getHarga();
            
            double hargapotong = hargaAwal * diskon;
            double hargasetelahdiskon = hargaAwal - hargapotong;
            double harga_pajak = hargasetelahdiskon * Pelatihan.pajak; 
            double harga_akhir = hargasetelahdiskon + harga_pajak;
           
            totalHarga += harga_akhir;
        }
        System.out.println("Harga Akhir untuk " + getNamaPeserta() + ": " + totalHarga);
    }

    @Override   
    public void printInfo() {
        super.printInfo();
        System.out.println("No Anggota: " + noAnggota);
        System.out.println("Tanggal Bergabung: " + tanggalBergabung);
    }
    
}