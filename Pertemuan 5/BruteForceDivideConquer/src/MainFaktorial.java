import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner cinthya = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = cinthya.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" +(i+1)+" : ");
            fk[i].nilai = cinthya.nextInt();
        }

        System.out.println("===========================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long startTimeBF = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialIBF(fk[i].nilai));
        }
        long endTimeBF = System.nanoTime();
        long elapsedTimeBF = endTimeBF - startTimeBF;
        System.out.println("Waktu eksekusi Brute Force: " + elapsedTimeBF + " nanosekon");

        System.out.println("============================================");
        System.out.println("Hasil Faktorial dengan Divide Conquer");
        long startTimeDC = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        long endTimeDC = System.nanoTime();
        long elapsedTimeDC = endTimeDC - startTimeDC;
        System.out.println("Waktu eksekusi Divide Conquer: " + elapsedTimeDC + " nanosekon");

        System.out.println("=============================================");
        cinthya.close();
    }
}