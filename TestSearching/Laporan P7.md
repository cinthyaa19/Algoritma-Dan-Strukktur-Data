# Laporan Praktikum Algoritma dan Struktur Data Pertemuan 7

Nama : Cinthya Achwatul Ifnu
Kelas : TI-1D
NIM : 2241720051

## Jobsheet VI
## SEARCHING

### 6.2 Searching / Pencarian Menggunakan Agoritma Sequential Search
#### 6.2.1 Langkah-langkah Percobaan Sequential Search
~~~ java 
package minggu7;

public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
~~~ 
~~~ java
package minggu7;

public class PencarianMhs {
    Mahasiswa listMHs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if(idx < listMHs.length) {
            listMHs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for(Mahasiswa m : listMHs) {
            m.tampil();
            System.out.println("-----------------------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMHs.length; j++) {
            if (listMHs[j].nim==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) 
    {
        if (pos!= -1) {
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);

        }else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x,int pos) 
    {
        if (pos!= -1) {
            System.out.println("Nim\t : " + x );
            System.out.println("Nama\t : " + listMHs[pos].nama );
            System.out.println("Umur\t : " + listMHs[pos].umur );
            System.out.println("IPK\t : " + listMHs[pos].ipk );
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}
~~~
~~~ java
package minggu7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for(int i = 0; i < jumMhs; i++) {
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

        System.out.println("-------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
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

        s.close();
        sl.close();
    }
}
~~~
#### 6.2.2 Verifikasi Hasil Percobaan
~~~ java
-----------------------------------------------------
Masukkan data mahasiswa secara Urut dari Nim Terkecil
-------------------------------------------------
Nim     : 2017
Nama    : Dewi Lestari
Umur    : 23
IPK     : 3.5
-------------------------------------------------
Nim     : 2018
Nama    : Sinta Sanjaya
Umur    : 22
IPK     : 4
-------------------------------------------------
Nim     : 2019
Nama    : Danang Adi
Umur    : 22
IPK     : 3.7
-------------------------------------------------
Nim     : 2020
Nama    : Budi Prakarsa
Umur    : 20
IPK     : 3.0
-------------------------------------------------
Nim     : 2021
Nama    : Vania Siti
Umur    : 20
IPK     : 3.0
-------------------------------------
Data keseluruhan Mahasiswa :
Nim  = 2017
Nama = Dewi Lestari
Umur = 23
IPK  = 3.5
-----------------------------------
Nim  = 2018
Nama = Sinta Sanjaya
Umur = 22
IPK  = 4.0
-----------------------------------
Nim  = 2019
Nama = Danang Adi
Umur = 22
IPK  = 3.7
-----------------------------------
Nim  = 2020
Nama = Budi Prakarsa
Umur = 20
IPK  = 3.0
-----------------------------------
Nim  = 2021
Nama = Vania Siti
Umur = 20
IPK  = 3.0
-----------------------------------
_____________________________________
_____________________________________
Pencarian Data :
Masukkan Nim Mahasiswa yang dicari:
NIM : 2018
menggunakan sequential search
data : 2018 ditemukan pada indeks 1
Nim      : 2018
Nama     : Sinta Sanjaya
Umur     : 22
IPK      : 4.0
~~~

#### 6.2.2 Pertanyaan
1. Perbedaan Method tampilPosisi dan tampilData pada class PencarianMhs terletak pada tampilan hasil output.

Method tampilPosisi menampilkan indeks suatu data dalam array listMHS jika data tersebut ditemukan. Jika data tidak ditemukan, maka method ini akan menampilkan pesan "data tidak ditemukan". Sedangkan hasil output method tampilPosisi hanya menampilkan indeks dari data yang dicari, tanpa menampilkan data mahasiswa secara lengkap.

Untuk method tampilData menampilkan seluruh data mahasiswa yang terkait dengan nim yang dicari, yaitu nama, umur, dan IPK. Jika data tidak ditemukan, maka method ini akan menampilkan pesan "data tidak ditemukan". Hasil output method tampilData menampilkan seluruh data mahasiswa yang terkait dengan nim yang dicari, sehingga hasil keluarannya lebih detail dibandingkan dengan method tampilPosisi.

2. break digunakan untuk menghentikan proses pencarian data jika data yang dicari sudah ditemukan. Ketika suatu data ditemukan, maka proses pencarian akan terhenti oleh pemanggilan break. dan proses pencarian data tidak dilanjutkan karena data yang dicari sudah ditemukan. Jika data tidak ditemukan pada array listMHS, maka nilai posisi akan tetap bernilai -1 karena tidak ada break yang dipanggil. Nilai -1 menunjukkan bahwa data yang di cari tidak ditemukan pada array listMHS.

3. Program pencarian dengan Sequential Search seperti pada contoh kode di atas dapat berjalan dengan baik meskipun data nim yang dimasukkan tidak terurut dari kecil ke besar. Namun, performa pencarian pada data yang tidak terurut ini dapat menjadi lebih lambat karena harus memeriksa semua elemen pada array sampai data yang dicari ditemukan.

program akan tetap dapat berjalan meskipun data nim yang diinputkan tidak terurut dari kecil ke besar. Namun, hasil pencarian dapat menjadi tidak efisien jika data yang dicari tidak ada pada array listMHS. karena Sequential Search akan memeriksa setiap elemen pada array secara berurutan hingga menemukan data yang dicari. Jika data yang dicari tidak ada pada array, maka pencarian akan terus berlangsung hingga elemen terakhir pada array dan mengembalikan nilai posisi -1 sebagai tanda bahwa data tidak ditemukan. Jadi disarankan untuk menyimpan data dalam urutan yang terurut.

### 6.3 Searching / Pencarian Menggunakan Binary Search
#### 6.3.1 Langkah-langkah Percobaan Binary Search
~~~ java
package minggu7;

public class PencarianMhs {
    Mahasiswa listMHs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if(idx < listMHs.length) {
            listMHs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for(Mahasiswa m : listMHs) {
            m.tampil();
            System.out.println("-----------------------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMHs.length; j++) {
            if (listMHs[j].nim==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) 
    {
        if (pos!= -1) {
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);

        }else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x,int pos) 
    {
        if (pos!= -1) {
            System.out.println("Nim\t : " + x );
            System.out.println("Nama\t : " + listMHs[pos].nama );
            System.out.println("Umur\t : " + listMHs[pos].umur );
            System.out.println("IPK\t : " + listMHs[pos].ipk );
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    //6.3. Searching / Pencarian Menggunakan Binary Search
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMHs[mid].nim) {
                return (mid);
            } else if (listMHs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
~~~
~~~ java
package minggu7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for(int i = 0; i < jumMhs; i++) {
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

        System.out.println("-------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
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
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        s.close();
        sl.close();
    }
}
~~~

#### 6.3.2 Verifikasi Hasil Percobaan
~~~ java
-----------------------------------------------------
Masukkan data mahasiswa secara Urut dari Nim Terkecil
-------------------------------------------------
Nim     : 2017
Nama    : Dewi Lestari
Umur    : 23
IPK     : 3.5
-------------------------------------------------
Nim     : 2018
Nama    : Sinta Sanjaya
Umur    : 22
IPK     : 4.0
-------------------------------------------------
Nim     : 2019
Nama    : Danang Adi
Umur    : 22
IPK     : 3.7
-------------------------------------------------
Nim     : 2020
Nama    : Budi Prakarsa
Umur    : 20
IPK     : 2.9
-------------------------------------------------
Nim     : 2021
Nama    : Vania Siti
Umur    : 20
IPK     : 3.0
-------------------------------------
Data keseluruhan Mahasiswa :
Nim = 2017
Nama = Dewi Lestari
Umur = 23
IPK = 3.5
-----------------------------------
Nim = 2018
Nama = Sinta Sanjaya
Umur = 22
IPK = 4.0
-----------------------------------
Nim = 2019
Nama = Danang Adi
Umur = 22
IPK = 3.7
-----------------------------------
Nim = 2020
Nama = Budi Prakarsa
Umur = 20
IPK = 2.9
-----------------------------------
Nim = 2021
Nama = Vania Siti
Umur = 20
IPK = 3.0
-----------------------------------
_____________________________________
_____________________________________
Pencarian Data :
Masukkan Nim Mahasiswa yang dicari:
NIM : 2018
menggunakan sequential search
data : 2018 ditemukan pada indeks 1
Nim      : 2018
Nama     : Sinta Sanjaya
Umur     : 22
IPK      : 4.0
=====================================
menggunakan binary Search
data : 2018 ditemukan pada indeks 1
Nim      : 2018
Nama     : Sinta Sanjaya
Umur     : 22
IPK      : 4.0
~~~

#### 6.3.3 Pertanyaan
1. mid = (left + right) / 2;
nilai variabel left dan right dijumlahkan, kemudian hasilnya dibagi dua untuk mendapatkan indeks tengah dari array yang sedang dicari. Inilah proses divide yang dilakukan pada algoritma binary search untuk membagi setengah array yang akan dicari pada setiap iterasi.

2. if (cari == listMHS[mid].nim) {
  return (mid);
} else if (listMHS[mid].nim > cari) {
  return findBinarySearch(cari, left, mid - 1);
} else {
  return findBinarySearch(cari, mid + 1, right);
}

3. Program dapat berjalan dan untuk algoritma sequential search dapat berjalan dengan baik namun saat algoritma binary search mengembalikan output "data tidak ditemukan" karena untuk algoritma binary search data harus berurutan sebelum dilakukan proses

4. Out put data tidak ditemukan. Tidak sesuai karena program tidak berurutan dari yang terkecil. Ubah variabel mid = (left + right) / 2; menjadi mid = (right + left) / 2;

5. 
~~~ java
package minggu_7;

public class Mahasiswa {

    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }

}
~~~
~~~ java
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
~~~
~~~ java
package minggu_7;

public class PencarianMhs {
    Mahasiswa listMHs[] = new Mahasiswa[5];
    int idx;

    public PencarianMhs(int jumMhs) {
        listMHs = new Mahasiswa[jumMhs];
    }

    void tambah(Mahasiswa m) {
        if(idx < listMHs.length) {
            listMHs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for(Mahasiswa m : listMHs) {
            m.tampil();
            System.out.println("-----------------------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMHs.length; j++) {
            if (listMHs[j].nim==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) 
    {
        if (pos!= -1) {
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);

        }else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x,int pos) 
    {
        if (pos!= -1) {
            System.out.println("Nim\t : " + x );
            System.out.println("Nama\t : " + listMHs[pos].nama );
            System.out.println("Umur\t : " + listMHs[pos].umur );
            System.out.println("IPK\t : " + listMHs[pos].ipk );
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    //6.3. Searching / Pencarian Menggunakan Binary Search
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMHs[mid].nim) {
                return (mid);
            } else if (listMHs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listMHs[j-1].nim > listMHs[j].nim) {
                    Mahasiswa tmp = listMHs[j-1];
                    listMHs[j-1] = listMHs[j];
                    listMHs[j] = tmp;
                }
            }
        }
    }
}
~~~u
~~~ java
-----------------------------------------------------
Masukkan jumlah Mahasiswi : 3
-----------------------------------------------------
Masukkan data mahasiswa secara Urut dari Nim Terkecil
-------------------------------------------------
Nim     : 2022
Nama    : Dian ayu
Umur    : 20
IPK     : 3.7
-------------------------------------------------
Nim     : 2021
Nama    : Clara viola
Umur    : 21
IPK     : 3.9
-------------------------------------------------
Nim     : 2020
Nama    : Wulan putri
Umur    : 22
IPK     : 3.5
------------------------------------
Data Mahasiswa Sebelum Diurutkan: 
Nim = 2022
Nama = Dian ayu
Umur = 20
IPK = 3.7
-----------------------------------
Nim = 2021
Nama = Clara viola
Umur = 21
IPK = 3.9
-----------------------------------
Nim = 2020
Nama = Wulan putri
Umur = 22
IPK = 3.5
-----------------------------------
------------------------------------
Data Mahasiswa Setelah Diurutkan:
Nim = 2020
Nama = Wulan putri
Umur = 22
IPK = 3.5
-----------------------------------
Nim = 2021
Nama = Clara viola
Umur = 21
IPK = 3.9
-----------------------------------
Nim = 2022
Nama = Dian ayu
Umur = 20
IPK = 3.7
-----------------------------------
_____________________________________
_____________________________________
Pencarian Data :
Masukkan Nim Mahasiswa yang dicari:
NIM : 2021
menggunakan sequential search
data : 2021ditemukan pada indeks 1
Nim      : 2021
Nama     : Clara viola
Umur     : 21
IPK      : 3.9
=====================================
menggunakan binary Search
data : 2021ditemukan pada indeks 1
Nim      : 2021
Nama     : Clara viola
Umur     : 21
IPK      : 3.9
~~~

### 6.4 Percobaan Pengayaan Divide and Conquer
#### 6.4.1 Langkah-langkah Percobaan Merge Sort
~~~ java
package MergeSortTest;

public class MergeSorting {
    
    public void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        //membandingkan setiap bagian
        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sort(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]) {
        int n= arr.length;
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
~~~
~~~ java
package MergeSortTest;

class SortMain {
    public static void main(String[] args) {
        int data[] ={10,40,30,50,70,20,100,90};
        System.out.println("sorting dengan merge sort");
        MergeSorting mSort= new MergeSorting();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}
~~~

#### 6.3.2 Verifikasi Hasil Percobaan
~~~ java
sorting dengan merge sort
data awal
10 40 30 50 70 20 100 90 
setelah diurutkan
10 20 30 40 50 70 90 100 
~~~

### 6.5 Latihan Praktikum
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
    - Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan dengan menggunakan algoritma merge sort!

~~~ java
package minggu7_2;

public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nim\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
        System.out.println("IPK\t: " + ipk);
    }

}
~~~
~~~ java
package minggu7_2;

import java.util.Scanner;

public class MahasiswaMain {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner sl = new Scanner(System.in);
    
    PencarianMahasiswa data = new PencarianMahasiswa();
    System.out.print("Masukkan jumlah data Mahasiswa : ");
    int jumMhs = s.nextInt();
    Mahasiswa[] inputan = new Mahasiswa[jumMhs];
    data.listMhs = inputan;
    
    System.out.println("-----------------------------------------------------");
    System.out.println("Masukkan data mahasiswa");
      for (int i = 0; i < jumMhs; i++) {
        System.out.println("-----------------------------------------------------");
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

      System.out.println("________________________________________________________");
      System.out.println("Data Keseluruhan Mahasiswa : ");
      data.tampil();
    
      System.out.println("______________________________________________");
      System.out.println("Pencarian Data : ");
      System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
      System.out.print("Nama\t: ");
      String cari = sl.nextLine();
    
      System.out.println();
      System.out.println("==============================================");
      System.out.println("Menggunakan Sequential Search");
      int posisi = data.findSeqSearch(cari);
    
      data.tampilPosisi(cari, posisi);
      data.tampilData(cari, posisi);
  }
}
~~~
~~~ java
package minggu7_2;

public class PencarianMahasiswa {
    Mahasiswa listMhs[];
    int idx;

  void tambah(Mahasiswa m) {
    if (idx < listMhs.length) {
      listMhs[idx] = m;
      idx++;
    } else {
      System.out.println("Data Sudah Penuh !!");
    }
  }

  void tampil() {
    for (Mahasiswa m : listMhs) {
      m.tampil();
      System.out.println("-----------------------");
    }
  }

  public int findSeqSearch(String cari) {
    int posisi = -1;
    for (int j = 0; j < listMhs.length; j++) {
      if (cari.equals(listMhs[j].nama)) {
        posisi = j;
        break;
      }
    }
    return posisi;
  }

  public void tampilPosisi(String x, int pos) {
    if (pos != -1) {
      System.out.println("data\t: " + x + " ditemukan pada indeks " + pos);
    } else {
      System.out.println("data\t" + x + " tidak ditemukan");
    }
  }


  public void tampilData(String x, int pos) {
    if (pos != -1) {
      System.out.println("Nim\t: " + listMhs[pos].nim);
      System.out.println("Nama\t: " + x);
      System.out.println("umur\t: " + listMhs[pos].umur);
      System.out.println("IPK\t: " + listMhs[pos].ipk);
    } else {
      System.out.println("Data " + x + " Tidak ditemukan");
    }
  }

}
~~~
~~~ java
Masukkan jumlah data Mahasiswa : 3
-----------------------------------------------------
Masukkan data mahasiswa
-----------------------------------------------------
Nim     : 2020
Nama    : Aldi Bayu
Umur    : 23
IPK     : 3.6
-----------------------------------------------------
Nim     : 2021
Nama    : Vina Ayu
Umur    : 22
IPK     : 3.0
-----------------------------------------------------
Nim     : 2022
Nama    : Rohman Hafid
Umur    : 21
IPK     : 3.9
________________________________________________________
Data Keseluruhan Mahasiswa : 
Nim     : 2020
Nama    : Aldi Bayu
Umur    : 23
IPK     : 3.6
-----------------------
Nim     : 2021
Nama    : Vina Ayu
Umur    : 22
IPK     : 3.0
-----------------------
Nim     : 2022
Nama    : Rohman Hafid
Umur    : 21
IPK     : 3.9
-----------------------
______________________________________________
Pencarian Data :
Masukkan Nama Mahasiswa yang dicari :
Nama    : Rohman Hafid

==============================================
Menggunakan Sequential Search
data    : Rohman Hafid ditemukan pada indeks 2
Nim     : 2022
Nama    : Rohman Hafid
umur    : 21
IPK     : 3.9
~~~ 

2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
    - Pencarian dilakukan berdasarkan Nama Mahasiswa (gunakan Algoritma Sequential Search)
    - Buat aturan untuk mendeteksi hasil pencarian lebih dari 1 hasil dalam bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang diberikan!
~~~ java 
package minggu7_2;

public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nim\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
        System.out.println("IPK\t: " + ipk);
    }
}
~~~
~~~ java
package minggu7_2;

import java.util.Scanner;

public class MahsiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
    
        PencarianMahasiswa data = new PencarianMahasiswa();
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jumMhs = s.nextInt();
        Mahasiswa[] inputan = new Mahasiswa[jumMhs];
        data.listMhs = inputan;
    
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa");
        for (int i = 0; i < jumMhs; i++) {
          System.out.println("-----------------------------------------------------");
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
        System.out.println("________________________________________________________");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();
    
        System.out.println("______________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
        System.out.print("Nama\t: ");
        String cari = sl.nextLine();
    
        System.out.println();
        System.out.println("==============================================");
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
    
        if (posisi != -1) {
          System.out.println("Data mahasiswa dengan nama " + cari + " ditemukan:");
          data.tampilData(cari, posisi);
        } else {
          System.out.println("Data mahasiswa dengan nama " + cari + " tidak ditemukan.");
        }
    
        int jml_data = 0;
        for (int j = 0; j < inputan.length; j++) {
          if (cari.equals(inputan[j].nama)) {
            jml_data++;
          }
        }
    
        if (jml_data > 1) {
          System.out.println("Terdapat " + jml_data + " data mahasiswa dengan nama yang sama.");
        }
      } 
}
~~~ java
package minggu7_2;

public class PencarianMahasiswa {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

  void tambah(Mahasiswa m) {
    if (idx < listMhs.length) {
      listMhs[idx] = m;
      idx++;
    } else {
      System.out.println("Data Sudah Penuh !!");
    }
  }

  void tampil() {
    for (Mahasiswa m : listMhs) {
      m.tampil();
      System.out.println("-----------------------");
    }
  }

  public int findSeqSearch(String cari) {
    int posisi = -1;
    for (int j = 0; j < listMhs.length; j++) {
      if (cari.equals(listMhs[j].nama)) {
        posisi = j;
        break;
      }
    }
    return posisi;
  }

  public void tampilPosisi(String x, int[] pos) {
    if (pos.length == 0) {
      System.out.println("data " + x + " tidak ditemukan");
    } else if (pos.length == 1) {
      System.out.println("data\t: " + x + " ditemukan pada indeks " + pos[0]);
    } else {
      System.out.print("Peringatan! Terdapat " + pos.length + " data dengan nama yang sama. ");
      System.out.print("Data ditemukan pada indeks: ");
      for (int i = 0; i < pos.length; i++) {
        System.out.print(pos[i]);
        if (i < pos.length - 1) {
          System.out.print(", ");
        }
      }
      System.out.println();
    }
  }

  public void tampilData(String x, int pos) {
    if (pos != -1) {
      System.out.println("Nim\t: " + listMhs[pos].nim);
      System.out.println("Nama\t: " + x);
      System.out.println("umur\t: " + listMhs[pos].umur);
      System.out.println("IPK\t: " + listMhs[pos].ipk);
    } else {
      System.out.println("Data " + x + " Tidak ditemukan");
    }
  }
}
~~~
~~~ java
Masukkan jumlah data Mahasiswa : 3
-----------------------------------------------------
Masukkan data mahasiswa
-----------------------------------------------------
Nim     : 2020
Nama    : Aldi Bayu
Umur    : 23
IPK     : 3.6
-----------------------------------------------------
Nim     : 2021
Nama    : Vina Ayu
Umur    : 22
IPK     : 3.
-----------------------------------------------------
Nim     : 2022
Nama    : Rohman Hafid
Umur    : 21
IPK     : 3.9
________________________________________________________
Data Keseluruhan Mahasiswa : 
Nim     : 2020
Nama    : Aldi Bayu
Umur    : 23
IPK     : 3.6
-----------------------
Nim     : 2021
Nama    : Vina Ayu
Umur    : 22
IPK     : 3.0
-----------------------
Nim     : 2022
Nama    : Rohman Hafid
Umur    : 21
IPK     : 3.9
-----------------------
______________________________________________
Pencarian Data :
Masukkan Nama Mahasiswa yang dicari :
Nama    : Rohman Hafid

==============================================
Menggunakan Sequential Search
Data mahasiswa dengan nama Rohman Hafid ditemukan:
Nim     : 2022
Nama    : Rohman Hafid
umur    : 21
IPK     : 3.9
~~~









