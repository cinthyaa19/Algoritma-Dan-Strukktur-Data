import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner cinthya = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int n = cinthya.nextInt();

        Sum[] sm = new Sum[n];
        for (int i = 0; i < n; i++) {
            System.out.println("====================================");
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("Masukkan Jumlah Bulan: ");
            int m = cinthya.nextInt();

            double[] keuntungan = new double[m];
            for (int j = 0; j < m; j++) {
                System.out.print("Masukkan untung bulan ke - "+(j+1)+" = ");
                keuntungan[j] = cinthya.nextDouble();
            }
            sm[i] = new Sum(m, keuntungan);
        }

        System.out.println("========================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < n; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama " + sm[i].elemen + " bulan adalah: " + (int) sm[i].totalBF());
        }
        System.out.println("========================================");
        System.out.println("Algoritma Divide Conquer");
        for (int i = 0; i < n; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama " + sm[i].elemen + " bulan adalah: " + (int) sm[i].totalDC(0, sm[i].elemen - 1));
        }
        cinthya.close();
    }
}