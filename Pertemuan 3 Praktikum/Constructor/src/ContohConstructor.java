public class ContohConstructor {

    String nama;
    String jenisKelamin;
    String username;
    String password;
    String kodeBarang;
    String alamat;
    int jumlah;
    int umur;
    double harga;

    public ContohConstructor() {
        nama = "Cinthya";
        umur = 19;
        jenisKelamin = "Perempuan";
    }

    public ContohConstructor(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public ContohConstructor(ContohConstructor a) {
        kodeBarang = a.kodeBarang;
        alamat = a.alamat;
        jumlah = a.jumlah;
        harga = a.harga;
    }
}
