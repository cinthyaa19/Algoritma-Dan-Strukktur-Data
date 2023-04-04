import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
      Scanner cinthya = new Scanner(System.in);
      
      System.out.println("===================================================");
      System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
      int elemen = cinthya.nextInt();
      System.out.println();

      Pangkat [] png = new Pangkat[elemen];

      for (int i = 0; i < elemen; i++) {
        //png[i] = new Pangkat();
        System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
        int nilai = cinthya.nextInt();
        //png[i].nilai = cinthya.nextInt();
        System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
        int pangkat = cinthya.nextInt();
        //png[i].pangkat = cinthya.nextInt();
        System.out.println();
        png[i] = new Pangkat(nilai, pangkat);
      }

      System.out.println("=======================================");
      System.out.println("Pilih metode yang ingin dijalankan: ");
      System.out.println("1. Brute Force");
      System.out.println("2. Divide and Conquer");
      System.out.println("Pilihan Anda: ");
      int pilihan = cinthya.nextInt();
      System.out.println();

      switch (pilihan) {
      //System.out.println("===================================================");
        case 1:
          System.out.println("Hasil Pangkat dengan Brute Force");
          for (int i = 0; i < elemen; i++) {
            png[i].tampil();
            int hasilBF = png[i].pangkatBF(png[i].nilai, png[i].pangkat);
            System.out.println("Hasil   : "+hasilBF);
            System.out.println();
        // System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
          }
          break;
        
        //System.out.println("===================================================");
        case 2:
          System.out.println("Hasil Pangkat dengan Divide Conquer");
          for (int i = 0; i < elemen; i++) {
            png[i].tampil();
            int hasilDC = png[i].pangkatDC(png[i].nilai, png[i].pangkat);
            System.out.println("Hasil   : "+hasilDC);
            System.out.println();
        //System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
          }
          break;

        default:
          System.out.println("Pilihan salah!");
      }

      System.out.println("===================================================");
      cinthya.close();
    }
}