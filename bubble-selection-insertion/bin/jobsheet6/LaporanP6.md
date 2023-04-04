# Laporan Praktikum Algoritma dan Struktur Data Pertemuan 6

Nama : Cinthya Achwatul Ifnu
Kelas : TI-1D
NIM : 2241720051

## Jobsheet V
## SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

### 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
#### 5.2.1 Langkah-langkah Percobaan
~~~ java 
package jobsheet6;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama        = " +nama);
        System.out.println("Tahun Masuk = " +thnMasuk);
        System.out.println("Umur        = " +umur);
        System.out.println("IPK         = " +ipk);
    }
}
~~~
~~~ java 
package jobsheet6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if(idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for(Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("---------------------------------");
        }
    }

    void bubbleSort() {
        for(int i=0; i<listMhs.length-1; i++) {
            for(int j=1; j<listMhs.length-i; j++) {
                if(listMhs[j].ipk > listMhs[j-1].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
~~~
~~~ java
package jobsheet6;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
    }
}
~~~

#### 5.2.1 Verifikasi Hasil Percobaan
~~~ java
Data mahasiswa sebelum sorting = 
Nama        = Nusa
Tahun Masuk = 2017
Umur        = 25
IPK         = 3.0
---------------------------------
Nama        = Rara
Tahun Masuk = 2012
Umur        = 19
IPK         = 4.0
---------------------------------
Nama        = Dompu
Tahun Masuk = 2018
Umur        = 19
IPK         = 3.5
---------------------------------
Nama        = Abdul
Tahun Masuk = 2017
Umur        = 23
IPK         = 2.0
---------------------------------
Nama        = Ummi
Tahun Masuk = 2019
Umur        = 21
IPK         = 3.75
---------------------------------

Data mahasiswa setelah sorting desc berdasarkan ipk
Nama        = Rara
Tahun Masuk = 2012
Umur        = 19
IPK         = 4.0
---------------------------------
Nama        = Ummi
Tahun Masuk = 2019
Umur        = 21
IPK         = 3.75
---------------------------------
Nama        = Dompu
Tahun Masuk = 2018
Umur        = 19
IPK         = 3.5
---------------------------------
Nama        = Nusa
Tahun Masuk = 2017
Umur        = 25
IPK         = 3.0
---------------------------------
Nama        = Abdul
Tahun Masuk = 2017
Umur        = 23
IPK         = 2.0
---------------------------------
~~~

#### 5.2.3 Pertanyaan
1. 