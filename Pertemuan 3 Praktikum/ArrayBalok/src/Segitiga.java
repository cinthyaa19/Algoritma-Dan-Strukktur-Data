public class Segitiga {
    public int alas;
    public int tinggi;
    public int sisiMiring;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return (int) (0.5 * alas * tinggi);
    }

    public int hitungKeliling() {
        int sisiMiring = (alas * alas) + (tinggi * tinggi);
        for(int i = 0; i < 1000; i++) {
            if(i * i == sisiMiring) {
                sisiMiring = i;
                break;
            }
        }
        return tinggi + alas + sisiMiring;
    }
}
