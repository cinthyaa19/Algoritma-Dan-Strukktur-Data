package minggu_7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.print("Masukkan jumlah Mahasiswi : ");
        int jumMHs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMHs);

        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for(int i = 0; i < jumMHs; i++) {
            System.out.println("-------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("------------------------------------");
        System.out.println("Data Mahasiswa Sebelum Diurutkan: ");
        data.tampil();
        
        data.bubbleSort();

        System.out.println("------------------------------------");
        System.out.println("Data Mahasiswa Setelah Diurutkan: ");
        data.tampil();
        
        System.out.println("_____________________________________");
        System.out.println("_____________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);

        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        //6.3. Searching / Pencarian Menggunakan Binary Search
        System.out.println("=====================================");
        System.out.println("menggunakan binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMHs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        s.close();
        sl.close();
    }
}

