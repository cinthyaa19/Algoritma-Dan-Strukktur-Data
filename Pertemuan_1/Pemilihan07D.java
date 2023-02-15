import java.util.Scanner;

public class Pemilihan07D {

    public static void main(String[] args) {
        Scanner cinthya = new Scanner (System.in);
        int nilai07D = 0, nilaiTugas07D, nilaiUTS07D, nilaiUAS07D;
        double nilaiAkhir07D =0;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas07D = cinthya.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS07D = cinthya.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS07D = cinthya.nextInt();

        System.out.println("===============================");

        System.out.println("===============================");
        nilaiAkhir07D = ((0.20 * nilaiTugas07D) + (0.35 * nilaiUTS07D) + (0.45 * nilaiUAS07D));
        System.out.println("Nilai Akhir: " + nilaiAkhir07D);

        if (nilaiAkhir07D >=0 || nilaiAkhir07D <=100) {
            if (nilaiAkhir07D >=80 && nilaiAkhir07D <=100) {
                System.out.println("Nilai Huruf: A");
                System.out.println("Selamat Lulus");
            }else if (nilaiAkhir07D >=73 && nilaiAkhir07D <=80) {
                System.out.println("Nilai Huruf B+");
                System.out.println("Selamat Lulus");
            }else if (nilaiAkhir07D >=65 && nilaiAkhir07D <=73) {
                System.out.println("Nilai Huruf: B");
                System.out.println("Selamat Lulus");
            }else if (nilaiAkhir07D >=60 && nilaiAkhir07D <=65) {
                System.out.println("Nilai Huruf: C+");
                System.out.println("Selamat Lulus");
            }else if (nilaiAkhir07D >=50 && nilaiAkhir07D <=60) {
                System.out.println("Nilai Huruf: C");
                System.out.println("Selamat Lulus");
            }else if (nilaiAkhir07D >=39 && nilaiAkhir07D <=50) {
                System.out.println("Nilai Huruf: D");
                System.out.println("Tidak Lulus");
            }else {
                System.out.println("Nilai E");
                System.out.println("Tidak Lulus");
            }
        }

    }
}
