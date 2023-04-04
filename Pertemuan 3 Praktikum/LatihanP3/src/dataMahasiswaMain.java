import java.util.Scanner;
public class dataMahasiswaMain {
    public static void main(String[] args) {
    Scanner cinthyaLine = new Scanner(System.in);
    Scanner cinthyaChar = new Scanner(System.in);
    Scanner cinthyaNumber = new Scanner(System.in);

    dataMahasiswa[] mahasiswa = new dataMahasiswa[3];

    for(int i = 0; i < mahasiswa.length; i++) {
        mahasiswa[i] = new dataMahasiswa();
        System.out.println("Masukkan data mahasiswa ke- " + (i+1));
        System.out.print("Masukkan nama: ");
        mahasiswa[i].nama = cinthyaLine.nextLine();
        System.out.print("Masukkan NIM: ");
        mahasiswa[i].nim = cinthyaNumber.nextLong();
        System.out.print("Masukkan Jenis Kelamin: ");
        mahasiswa[i].jenisKelamin = cinthyaChar.next().charAt(0);
        System.out.print("Masukkan IPK: ");
        mahasiswa[i].ipk = cinthyaNumber.nextDouble();
        System.out.println();
    }
    for(int i = 0; i < mahasiswa.length; i++) {
        System.out.println("Data Mahasiswa ke- " + (i+1));
        System.out.println("Nama: " + mahasiswa[i].nama);
        System.out.println("NIM: " + mahasiswa[i].nim);
        System.out.println("Jenis Kelamin: " + mahasiswa[i].jenisKelamin);
        System.out.println("IPK:  " + mahasiswa[i].ipk);
        System.out.println();
    }
    cinthyaChar.close();
    cinthyaNumber.close();
    cinthyaLine.close();
}
}