import java.util.Scanner;

public class MainPemilihanBEM {
    public static void main(String[] args) {
        Scanner cinthya = new Scanner(System.in);
        System.out.print("Masukkan banyaknya pemilihan: ");
        int elemen = cinthya.nextInt();
        cinthya.nextLine();
        PemilihanBEM pemilihanSuara = new PemilihanBEM(elemen);
        System.out.println("======================================");
        System.out.println("              NAMA KANDIDAT           ");
        System.out.println("======================================");
        pemilihanSuara.NamaKandidat();

        System.out.println("======================================");
        System.out.println("                PEMILIHAN             ");
        System.out.println("======================================"); 
        int pilih = 0;
        int i = 0;
        while (i < elemen) {
            System.out.print((i + 1) + ". Pilih no urut: ");
            pilih = cinthya.nextInt();
            if (pilih > 4) {
                System.out.println("Tidak ada kandidat dengan nomor urut " + pilih);
            } else {
                pemilihanSuara.banyak[i] = pilih;
                i++;
            }
        }

        System.out.println("======================================");
        System.out.println("                  HASIL               ");
        System.out.println("======================================"); 
        String hasil = pemilihanSuara.pilihanDC(pemilihanSuara.banyak, 0, elemen - 1);
        System.out.println("Kandidat Terpilih adalah: " + hasil);
        System.out.println("======================================");
        cinthya.close();
    }
}
