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

#### 5.2.2 Verifikasi Hasil Percobaan
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
1. Proses Bubble Sort terdapat paada method bubblesort() yang   terdapat pada class DaftarMahasiswaBerprestasi.

2. Program tersebut digunakan untuk membandingkan antara nilai IPK indeks j dengan nilai IPK indeks j-1. jika kondisi nilai IPK array of object indeks j lebih besar dari nilai IPK array of object j-1, maka akan dilakukan pertukaran nilai. hingga nantinya akan menghasilkan output nilai IPK dari yang terbesar ke terkecil. 

Terdapat 3 tahap pada program tersebut : 
    1. pada tahap pertama dilakukan pembuatan object sementara untuk menyimpan nilai indeks j
    2. pada tahap kedua dilakukan pengisian nilai indeks j dengan nilai object indeks j-1.
    3. pada tahap ketiga dilakukan pengisian nilai indeks j-1 dengan nilai object temp.

3. a. Perulangan i merupakan sebuah proses perulangan yang harus dilakukan oleh bubble sort berdasarkan ukuran array. Sedangkan perulangan j merupakan sebuah perulangan yanng digunakan untuk membandingkan nilai-nilai dari indeks array.

b. Karena syarat pada perulangan i berkaitan dengan batas perulangan j yaitu 2. saat perulangan i mencapai batas maksimal maka perulangan j juga akan mencpai batas maksimalnya. Syarat pada perulangan i membuat perulangan j untuk membandingkan 2 indeks terakhir sehingga terdapat 1 langkah.

c. Karena syarat ini berkaitan dengan array yang perlu di cek pada setiap langkahnya. program akan mengecek indeks paling awal hingga terjadi suatu urutan array.

d. Jika banyak data dalam listMhs 50, maka perulangan i akan berlangsung sebanyak 49 kali dan terdapat total tahap sebanyak 1225 kali. Karena Menurut syarat j < listMhs.length - i, langkah paling banyak adalah ketika nilai i paling kecil, yaitu 0. Yang berarti langkah paling banyak adalah j < 50, yaitu 49. Dengan nilai awal adalah langkah paling sedikit yaitu 1 dan besaran beda adalah 1.

### 5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
#### 5.3.1 Langkah-langkah Percobaan
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

    void selectionsort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if(listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
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

        System.out.println(" ");
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.selectionsort();
        list.tampil();
    }
}
~~~

#### 5.3.2 Verifikasi Hasil Percobaan
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
Data mahasiswa setelah sorting desc berdasarkan ipk
Nama        = Abdul
Tahun Masuk = 2017
Umur        = 23
IPK         = 2.0
---------------------------------
Nama        = Nusa
Tahun Masuk = 2017
Umur        = 25
IPK         = 3.0
---------------------------------
Nama        = Dompu
Tahun Masuk = 2018
Umur        = 19
IPK         = 3.5
---------------------------------
Nama        = Ummi
Tahun Masuk = 2019
Umur        = 21
IPK         = 3.75
---------------------------------
Nama        = Rara
Tahun Masuk = 2012
Umur        = 19
IPK         = 4.0
---------------------------------
~~~

#### 5.3.3 Pertanyaan
1. Proses tersebut digunakan untuk membandingkan IPK melalu increment j++. dilakukan dengan membandingkan setiap indeks yang ada di outer loop dengan semua indeks yang ada di array melalui inner loop. kemudian terdapat nilai idxMin yang diinisialisasikan dengan nilai j atau indeks dimana kondisi if terpenuhi. idxMin digunakan untuk mengganti nilai antar indeks. langkah ini akan diulang terus menerus hingga iterasi outer loop mencapai batas maksimal

### Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
#### 5.4.1 Langkah-langkah Percobaan
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

    void selectionsort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if(listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionsort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
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

        System.out.println(" ");
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.selectionsort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.insertionsort();
        list.tampil();
    }
}
~~~

#### 5.4.2 Verifikasi Hasil Percobaan
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
Data mahasiswa setelah sorting desc berdasarkan ipk
Nama        = Abdul
Tahun Masuk = 2017
Umur        = 23
IPK         = 2.0
---------------------------------
Nama        = Nusa
Tahun Masuk = 2017
Umur        = 25
IPK         = 3.0
---------------------------------
Nama        = Dompu
Tahun Masuk = 2018
Umur        = 19
IPK         = 3.5
---------------------------------
Nama        = Ummi
Tahun Masuk = 2019
Umur        = 21
IPK         = 3.75
---------------------------------
Nama        = Rara
Tahun Masuk = 2012
Umur        = 19
IPK         = 4.0
---------------------------------
Data mahasiswa setelah sorting desc berdasarkan ipk
Nama        = Abdul
Tahun Masuk = 2017
Umur        = 23
IPK         = 2.0
---------------------------------
Nama        = Nusa
Tahun Masuk = 2017
Umur        = 25
IPK         = 3.0
---------------------------------
Nama        = Dompu
Tahun Masuk = 2018
Umur        = 19
IPK         = 3.5
---------------------------------
Nama        = Ummi
Tahun Masuk = 2019
Umur        = 21
IPK         = 3.75
---------------------------------
Nama        = Rara
Tahun Masuk = 2012
Umur        = 19
IPK         = 4.0
---------------------------------
~~~

#### 5.4.3 Pertanyaan
~~~ java
void insertionsort() {
        for (int i = 0; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
~~~ 

### 5.5 Latihan Praktikum
~~~ java
package jobsheet6;

public class Hotel {
    String nama, kota;
    int harga;
    byte bintang;

    Hotel(String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil() {
        System.out.println("Nama    : " + nama);
        System.out.println("Kota    : " + kota);
        System.out.println("Harga   : " + harga);
        System.out.println("Bintang : " + bintang);
    }
}
~~~
~~~ java
package jobsheet6;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int idx;

    void tambah(Hotel h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for (Hotel h : rooms) {
          h.tampil();
          System.out.println("==========================");
        }
      }
    
    void bubblesort(String filter) {
        if (filter.equals("harga")) {
            for (int i = 0; i < rooms.length-1; i++) {
                for (int j = 1; j < rooms.length-i; j++) {
                    if (rooms[j].harga < rooms[j-1].harga) {
                        Hotel tmp = rooms[j];
                        rooms[j] = rooms[j-1];
                        rooms[j-1] = tmp;
                    }
                }
            }
        }else{
            for (int i = 0; i < rooms.length-1; i++) {
                for (int j = 1; j < rooms.length-i; j++) {
                    if (rooms[j].bintang > rooms[j-1].bintang) {
                        Hotel tmp = rooms[j];
                        rooms[j] = rooms[j-1];
                        rooms[j-1] = tmp;
                    }
                }
            }
        }
    }

    void selectionsort(String filter) {
        if (filter.equals("harga")) {
            for (int i = 0; i < rooms.length-1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < rooms.length; j++) {
                    if (rooms[j].harga < rooms[idxMin].harga) {
                      idxMin = j;
                    }
                  }
                  Hotel tmp = rooms[idxMin];
                  rooms[idxMin] = rooms[i];
                  rooms[i] = tmp;
            }
        }else{
            for (int i = 0; i < rooms.length-1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < rooms.length; j++) {
                    if (rooms[j].bintang > rooms[idxMin].bintang) {
                        idxMin = j;
                    }
                }
                Hotel tmp = rooms[idxMin];
                rooms[idxMin] = rooms[i];
                rooms[i] = tmp;
            }
        }
    }
}
~~~
~~~ java 
package jobsheet6;

import java.util.Scanner;

public class HotelMain {
    static Scanner cinthya = new Scanner(System.in);

    public static void main(String[] args) {
        HotelService rooms = new HotelService();
        Hotel h1 = new Hotel("Harris Hotel & Conventions", "Malang", 500000, (byte) 1);
        Hotel h2 = new Hotel("Grand Cakra Hotel", "Malang", 400000, (byte) 2);
        Hotel h3 = new Hotel("Atria Hotel", "Malang", 300000, (byte) 3);
        Hotel h4 = new Hotel("The Shalimar Boutique Hotel", "Malang", 1000000, (byte) 4);
        Hotel h5 = new Hotel("Hotel Tugu", "Malang", 1500000, (byte) 5);

        rooms.tambah(h1);
        rooms.tambah(h2);
        rooms.tambah(h3);
        rooms.tambah(h4);
        rooms.tambah(h5);

        while(true){
            System.out.println("      Program Travel  ");
            System.out.println("====== Menu Program ======");
            System.out.println("1. Daftar Penginapan sesuai harga asc");
            System.out.println("2. Daftar Penginapan sesuai Rating dsc");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            int menu = cinthya.nextInt();
            System.out.println();
            
            if (menu == 1){
                System.out.println("Daftar Harga asc Bubble Sort");
                rooms.bubblesort("harga");
                rooms.tampilAll();
                System.out.println();
                System.out.println("Daftar Harga asc Selection Sort");
                rooms.selectionsort("harga");
                rooms.tampilAll();
                System.out.println();

            }else if (menu == 2){
                System.out.println("Daftar Rating dsc Bubble Sort");
                rooms.bubblesort("rating");
                rooms.tampilAll();
                System.out.println();
                System.out.println("Daftar Rating dsc Selection Sort");
                rooms.selectionsort("rating");
                rooms.tampilAll();
                System.out.println();
            }else if(menu == 3){
                System.out.println("Terimakasih");
                break;
            }else {
                System.out.println("Pilih inputan dengan benar");
            }
        }
    }
}
~~~
~~~ java 
Hotel       
====== Menu Program ======
1. Daftar Penginapan sesuai harga asc
2. Daftar Penginapan sesuai Rating dsc
3. Keluar
Pilih Menu : 1

Daftar Harga asc Bubble Sort
Nama    : Atria Hotel
Kota    : Malang
Harga   : 300000
Bintang : 3
==========================
Nama    : Grand Cakra Hotel
Kota    : Malang
Harga   : 400000
Bintang : 2
==========================
Nama    : Harris Hotel & Conventions
Kota    : Malang
Harga   : 500000
Bintang : 1
==========================
Nama    : The Shalimar Boutique Hotel
Kota    : Malang
Harga   : 1000000
Bintang : 4
==========================
Nama    : Hotel Tugu
Kota    : Malang
Harga   : 1500000
Bintang : 5
==========================

Daftar Harga asc Selection Sort
Nama    : Atria Hotel
Kota    : Malang
Harga   : 300000
Bintang : 3
==========================
Nama    : Grand Cakra Hotel
Kota    : Malang
Harga   : 400000
Bintang : 2
==========================
Nama    : Harris Hotel & Conventions
Kota    : Malang
Harga   : 500000
Bintang : 1
==========================
Nama    : The Shalimar Boutique Hotel
Kota    : Malang
Harga   : 1000000
Bintang : 4
==========================
Nama    : Hotel Tugu
Kota    : Malang
Harga   : 1500000
Bintang : 5
==========================

        Hotel
====== Menu Program ======
1. Daftar Penginapan sesuai harga asc
2. Daftar Penginapan sesuai Rating dsc
3. Keluar
Pilih Menu : 2

Daftar Rating dsc Bubble Sort
Nama    : Hotel Tugu
Kota    : Malang
Harga   : 1500000
Bintang : 5
==========================
Nama    : The Shalimar Boutique Hotel
Kota    : Malang
Harga   : 1000000
Bintang : 4
==========================
Nama    : Atria Hotel
Kota    : Malang
Harga   : 300000
Bintang : 3
==========================
Nama    : Grand Cakra Hotel
Kota    : Malang
Harga   : 400000
Bintang : 2
==========================
Nama    : Harris Hotel & Conventions
Kota    : Malang
Harga   : 500000
Bintang : 1
==========================

Daftar Rating dsc Selection Sort
Nama    : Hotel Tugu
Kota    : Malang
Harga   : 1500000
Bintang : 5
==========================
Nama    : The Shalimar Boutique Hotel
Kota    : Malang
Harga   : 1000000
Bintang : 4
==========================
Nama    : Atria Hotel
Kota    : Malang
Harga   : 300000
Bintang : 3
==========================
Nama    : Grand Cakra Hotel
Kota    : Malang
Harga   : 400000
Bintang : 2
==========================
Nama    : Harris Hotel & Conventions
Kota    : Malang
Harga   : 500000
Bintang : 1
==========================
~~~


