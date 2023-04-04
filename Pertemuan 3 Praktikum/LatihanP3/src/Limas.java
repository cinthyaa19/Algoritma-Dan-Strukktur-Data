import java.util.Scanner;
public class Limas {
    Scanner cinthya = new Scanner(System.in);
    public double panjangSisi;
    public double sisiAlas, tinggi;
    public double luasPermukaanLimas() {
        double tinggiSegitiga = Math.sqrt((1/4 * sisiAlas * sisiAlas) + (tinggi * tinggi));
        return ((sisiAlas * sisiAlas) + (4 * 1/2 * sisiAlas * tinggiSegitiga));
    }

    public double volumeLimas() {
        return ((sisiAlas * sisiAlas) * 1/3 * tinggi);
    }
}

