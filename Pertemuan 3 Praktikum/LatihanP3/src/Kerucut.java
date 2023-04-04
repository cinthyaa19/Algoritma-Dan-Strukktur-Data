public class Kerucut {
    public double jari, tinggi, sisiMiring;
    
    public double luasPermukaanKerucut() {
        return jari * 3.14 * (jari * sisiMiring);
    }

    public double volumeKerucut() {
        tinggi = Math.sqrt((sisiMiring * sisiMiring) - (tinggi * tinggi));
        return jari * jari * 1/3 * 3.14 * tinggi;
    }
}