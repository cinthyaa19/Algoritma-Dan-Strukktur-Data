# Laporan Praktikum Algoritma dan Struktur Data P5

Nama : Cinthya Achwatul Ifnu
Kelas : TI-1D
NIM : 2241720051

## Jobsheet IV
## BRUTE FORCE DAN DIVIDE CONQUER

### 4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

#### 4.2.1 Langkah-langkah Percobaan
~~~ java
public class Faktorial {
   public int nilai;

   public int faktorialIBF(int n) {
    int fakto = 1;
    for (int i = 1; i <= n; i++) {
        fakto = fakto * i;
    }
    return fakto;
   }

   public int faktorialDC(int n) {
    if (n==1) {
        return 1;
    }
    else
    {
        int fakto = n * faktorialDC(n-1);
        return fakto;
    }
   }
}
~~~

~~~ java 
import java.util.Scanner;
public class MainFaktorial {

    public static void main(String[] args) {
        Scanner cinthya = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = cinthya.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" +(i+1)+" : ");
            fk[i].nilai = cinthya.nextInt();
        }

        System.out.print("==========================================");
        System.out.print("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialIBF(fk[i].nilai));
        }

        System.out.println("========================================");
        System.out.println("Hasil Faktorial dengan Divide Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }

        System.out.println("========================================");
    }
}
~~~
#### 4.2.2 Verifikasi Hasil Percobaan
~~~ java
========================================
Masukkan jumlah elemen yang ingin dihitung : 3
Masukkan nilai data ke-1 : 5
Masukkan nilai data ke-2 : 8
Masukkan nilai data ke-3 : 3
==========================================
Hasil Faktorial dengan Brute Force
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 3 adalah : 6
========================================
Hasil Faktorial dengan Divide Conquer
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 3 adalah : 6
========================================
~~~
#### 4.2.3 Pertanyaan
1. pada base line Algoritma Divide Conquer menggunakan if(n==1) dan return 1, yang berarti bahwa bila nilai yang akan diinputkan nanti adalah 1 maka output yang akan ditampilkan pada class main adalah 1. dan nilai tersebut merupakan batas dari divide conquer dimana perulangan kali berakhir jika n=1.

2. pada implementasi Algoritma Divide and Conquer Faktorial diatas sudah lengkap, terdapat 3 tahapan diantaranya :

    1. Divide : dalam percobaan 1 Faktorial terdapat pemecahan masalah yang menggunakan konidisi pemiliha if-else, dimana if merupakan base case dan else sebagai rekursif call.

    2. Conquer : dalam percobaan 1 Faktorial terdapat pemecahan masalah yang menggunakan else int fakto = n * faktorialDC(n-1). sehingga setiap masalah akan dikalikan sendiri-sendiri.

    3. Combine : dalam percobaan 1 Faktorial terdapat pemecahan masalah yang menggunakan return dari proses rekursif pada return fakto; di else dalam method faktorialDC().

3. menurut saya memungkinkan menggunakan perulangan lain pada method faktorialIBF() contohnya menggunaka perulangan while dan do-while, seperti pada program berikut : 
~~~ java
public class FaktorialIBFWhile {
    
    public int faktorialIBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }
}
~~~
~~~ java 
public class FaktorialIBFDoWhile {
    
    public int faktorialIBF(int n) {
        int fakto = 1;
        int i = 1;
        do {
            fakto *= i;
            i++;
        } while (i <= n);
        return fakto;
    }
}
~~~
4. Penambahan Pengecekan Waktu Eksekusi
~~~ java 
public class Faktorial {
   public int nilai;

   public int faktorialIBF(int n) {
    int fakto = 1;
    for (int i = 1; i <= n; i++) {
        fakto = fakto * i;
    }
    return fakto;
   }

   public int faktorialDC(int n) {
    if (n==1) {
        return 1;
    }
    else
    {
        int fakto = n * faktorialDC(n-1);
        return fakto;
    }
   }
}
~~~
~~~ java
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
    }
}
~~~
5. Bukti waktu eksekusi dengan 20 angka
~~~ java 
===========================================
Masukkan jumlah elemen yang ingin dihitung : 20
Masukkan nilai data ke-1 : 1
Masukkan nilai data ke-2 : 2
Masukkan nilai data ke-3 : 3
Masukkan nilai data ke-4 : 4
Masukkan nilai data ke-5 : 5
Masukkan nilai data ke-6 : 6
Masukkan nilai data ke-7 : 7
Masukkan nilai data ke-8 : 8
Masukkan nilai data ke-9 : 9
Masukkan nilai data ke-10 : 10
Masukkan nilai data ke-11 : 11
Masukkan nilai data ke-12 : 12
Masukkan nilai data ke-13 : 13
Masukkan nilai data ke-14 : 14
Masukkan nilai data ke-15 : 15
Masukkan nilai data ke-16 : 16
Masukkan nilai data ke-17 : 17
Masukkan nilai data ke-18 : 18
Masukkan nilai data ke-19 : 19
Masukkan nilai data ke-20 : 20
===========================================
Hasil Faktorial dengan Brute Force
Faktorial dari nilai 1 adalah : 1
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 4 adalah : 24
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 6 adalah : 720
Faktorial dari nilai 7 adalah : 5040
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 9 adalah : 362880
Faktorial dari nilai 10 adalah : 3628800
Faktorial dari nilai 11 adalah : 39916800
Faktorial dari nilai 12 adalah : 479001600
Faktorial dari nilai 13 adalah : 1932053504
Faktorial dari nilai 14 adalah : 1278945280
Faktorial dari nilai 15 adalah : 2004310016
Faktorial dari nilai 16 adalah : 2004189184
Faktorial dari nilai 17 adalah : -288522240
Faktorial dari nilai 18 adalah : -898433024
Faktorial dari nilai 19 adalah : 109641728
Faktorial dari nilai 20 adalah : -2102132736
Waktu eksekusi Brute Force: 5430100 nanosekon
============================================
Hasil Faktorial dengan Divide Conquer
Faktorial dari nilai 1 adalah : 1
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 4 adalah : 24
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 6 adalah : 720
Faktorial dari nilai 7 adalah : 5040
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 9 adalah : 362880
Faktorial dari nilai 10 adalah : 3628800
Faktorial dari nilai 11 adalah : 39916800
Faktorial dari nilai 12 adalah : 479001600
Faktorial dari nilai 13 adalah : 1932053504
Faktorial dari nilai 14 adalah : 1278945280
Faktorial dari nilai 15 adalah : 2004310016
Faktorial dari nilai 16 adalah : 2004189184
Faktorial dari nilai 17 adalah : -288522240
Faktorial dari nilai 18 adalah : -898433024
Faktorial dari nilai 19 adalah : 109641728
Faktorial dari nilai 20 adalah : -2102132736
Waktu eksekusi Divide Conquer: 6031600 nanosekon
~~~

### 4.3 Menghitung Hasil Pangkat dengan ALgoritma Brute Force dan Divide and Conquer

#### 4.3.1 Langkah-langkah Percobaan
~~~ java
public class Pangkat {
public int nilai,pangkat;

public int pangkatBF(int a, int n) {
    int hasil = 1;
    for (int i = 0; i < n; i++) {
        hasil = hasil * a;
    }
    return hasil;
}

public int pangkatDC(int a, int n) {
    if (n==0) {
        return 1;
    }
    else 
    {
        if(n%2==1)//builangan ganjil
            return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
        else//bilangan genap
            return (pangkatDc(a,n/2)*pangkatDC(a,n/2));
    }
}
}
~~~
~~~ java
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
      Scanner cinthya = new Scanner(System.in);
      
      System.out.println("===================================================");
      System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
      int elemen = cinthya.nextInt();

      Pangkat [] png = new Pangkat[elemen];

      for (int i = 0; i < elemen; i++) {
        png[i] = new Pangkat();
        System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
        png[i].nilai = cinthya.nextInt();
        System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
        png[i].pangkat = cinthya.nextInt();
      }

      System.out.println("===================================================");
      System.out.println("Hasil Pangkat dengan Brute Force");
      for (int i = 0; i < elemen; i++) {
        System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
      }

      System.out.println("===================================================");
      System.out.println("Hasil Pangkat dengan DIvide Conquer");
      for (int i = 0; i < elemen; i++) {
        System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
      }

      System.out.println("===================================================");
    }
}
~~~

#### 4.3.2 Verifikasi Hasil Percobaan
~~~ java
===================================================
Masukkan jumlah elemen yang ingin dihitung : 2
Masukkan nilai yang akan dipangkatkan ke-1 : 6
Masukkan nilai pemangkat ke-1 : 2
Masukkan nilai yang akan dipangkatkan ke-2 : 4
Masukkan nilai pemangkat ke-2 : 3
===================================================
Hasil Pangkat dengan Brute Force
Nilai 6 pangkat 2 adalah : 36
Nilai 4 pangkat 3 adalah : 64
===================================================
Hasil Pangkat dengan DIvide Conquer
Nilai 6 pangkat 2 adalah : 36
Nilai 4 pangkat 3 adalah : 64
===================================================
~~~

#### 4.3.3 Pertanyaan
1. pada Method pangkatBF kurang efisien dalam melakukan perhitungan pangkat jika nilai nya besar karena metode ini menghitung nilai pangkat dengan cara mengalikan bilangan a sebanyak n kali.

sedangkan pada method pangkatDC sangat efisian dalam melakukan perhitungan pangkat terutama untuk nilai yang besar karena metode ini menggunakan prinsip pembagian masalah menjadi sub-masalah yang dipecahkan secara terpisah kemudian digabung kembali hingga mendapatkan solusi akhir. 

2. Pada baris pertama terdapat kondisi if (n % 2 == 1) kondisi ini berfungsi untuk mengecek apakah nilai n merupakan bilangan ganjil.

Jika ya, maka rekursi dilakukan pada bilangan a pangkat n/2, dikalikan dengan dirinya sendiri (pangkatDC(a, n/2)* pangkatDC(a, n/2)) dan dikalikan lagi dengan a.

Jika n merupakan bilangan genap, maka rekursi dilakukan pada bilangan a pangkat n/2, dan dikalikan dengan dirinya sendiri (pangkatDC(a, n/2)* pangkatDC(a, n/2)).

3. Ya, tahap combine sudah termasuk dalam kode tersebut pada method pangkatDC() yang merupakan implementasi algoritma Divide and Conquer untuk menghitung pangkat bilangan.

Dalam implementasi ini, operasi perkalian tersebut terletak
pada statement return (pangkatDC(a, n/2)* pangkatDC(a, n/2) * a) dan return (pangkatDC(a,n/2)* pangkatDC(a, n/2)). Jadi, tahap combine sudah diimplementasikan pada metode pangkatDC() pada bagian return value-nya.

4. Modifikasi kode program dengan cara pengisian atribut yang dilakukan oleh konstruktor
~~~ java
public class Pangkat {
    
public int nilai,pangkat;

Pangkat(int n, int p) {
    nilai = n;
    pangkat = p;
}

public void tampil() {
    System.out.println("Nilai   : "+this.nilai);
    System.out.println("Pangkat   : "+this.pangkat);
}

public int pangkatBF(int a, int n) {
    int hasil = 1;
    for (int i = 0; i < n; i++) {
        hasil = hasil * a;
    }
    return hasil;
}

public int pangkatDC(int a, int n) {
    if (n==0) {
        return 1;
    }
    else 
    {
        if(n%2==1)//builangan ganjil
            return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
        else//bilangan genap
            return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
    }
}
}
~~~
~~~ java 
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

      System.out.println("===================================================");
      System.out.println("Hasil Pangkat dengan Brute Force");
      for (int i = 0; i < elemen; i++) {
        png[i].tampil();
        int hasilBF = png[i].pangkatBF(png[i].nilai, png[i].pangkat);
        System.out.println("Hasil   : "+hasilBF);
        System.out.println();
        // System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
      }

      System.out.println("===================================================");
      System.out.println("Hasil Pangkat dengan Divide Conquer");
      for (int i = 0; i < elemen; i++) {
        png[i].tampil();
        int hasilDC = png[i].pangkatDC(png[i].nilai, png[i].pangkat);
        System.out.println("Hasil   : "+hasilDC);
        System.out.println();
        //System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
      }

      System.out.println("===================================================");
    }
}
~~~
5. Modifikasi kode program dengan menambahkan menu
~~~ java
public class Pangkat {
    
public int nilai,pangkat;

Pangkat(int n, int p) {
    nilai = n;
    pangkat = p;
}

public void tampil() {
    System.out.println("Nilai   : "+this.nilai);
    System.out.println("Pangkat   : "+this.pangkat);
}

public int pangkatBF(int a, int n) {
    int hasil = 1;
    for (int i = 0; i < n; i++) {
        hasil = hasil * a;
    }
    return hasil;
}

public int pangkatDC(int a, int n) {
    if (n==0) {
        return 1;
    }
    else 
    {
        if(n%2==1)//builangan ganjil
            return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
        else//bilangan genap
            return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
    }
}
}
~~~
~~~ java
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
    }
}
~~~

### 4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide Conquer
#### 4.4.1 Langkah-langkah Percobaan
~~~ java
public class Sum {

    public int elemen;
    public double keuntungan[];
    public double total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan=new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if(l==r)
            return arr[l];
        else if(l<r) {
            int mid=(l+r)/2;
            double lsum=totalDC(arr,l,mid-1);
            double rsum=totalDC(arr,mid+1,r);
            return lsum+rsum+arr[mid];
        }

        return 0;
    }
}
~~~
~~~ java
import java.util.Scanner;
public class MainSum {

    public static void main(String[] args) {
        Scanner cinthya = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan JUta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = cinthya.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("========================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
            sm.keuntungan[i] = cinthya.nextDouble();
        }

        System.out.println("========================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("========================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = "+sm.totalDC(sm.keuntungan, 0,sm.elemen-1));
    }
}
~~~

#### 4.4.2 Verifikasi Hasil Percobaan
~~~ java
========================================
Program Menghitung Keuntungan Total (Satuan JUta. Misal 5.9)
Masukkan jumlah bulan : 5
========================================
Masukkan untung bulan ke - 1 = 8.5
Masukkan untung bulan ke - 2 = 9.54
Masukkan untung bulan ke - 3 = 7.2
Masukkan untung bulan ke - 4 = 9.1
Masukkan untung bulan ke - 5 = 6
========================================
Algoritma Brute Force
Total keuntungan perusahaan selama 5bulan adalah = 40.339999999999996
========================================
Algoritma Divide Conquer
Total keuntungan perusahaan selama 5bulan adalah = 40.34
~~~

#### 4.4.3 Pertanyaan
1. Ilustrasi perhitungan keuntungan dengan metode Total(BF)
    mengitung keuntungan dengan menjumlahkan setiap elemen pada array.
    contoh array keuntungan {0.5,10.5,20.0,15.5,20.5}
    total = 20.0 +  0.5  = 20.5
    total = 20.5 + 10.5  = 40.0
    total = 40.0 + 20.0  = 60.0
    total = 50.5 + 15.5  = 75.0
    total = 75.0 + 20.5  = 95.5
    total keuntungan = 95.5

   Ilustrasi perhitungan keuntungan dengan metode Total(DC)
    menghitung keuntungan dengan membagagi array menjadi 2 bagian yang sama besar secara rekursif hingga menemukan array yang lebih kecil atau sama dengan 1. lalu menghitung setiap bagian, kemudian menjumlahkan kedua total dari total hitung setiap bagian dengan elemen tengah array.

    contoh array keuntungan {0.5,10.5,20.0,15.5,20.5}
    membagi array {0.5,10.5,20.0} dan {15.5,20.5}
    menghitung keuntungan pada setiap bagian :
        1.  0.5 + 10.5 + 20.0 = 40.0
        2. 15.5 + 20.5 = 45.0
    menjumlahkan kedua total dengan elemen tengah array :
        40.0 + 45.0 + 20.0 = 105.0
    total keuntungan = 105.0

2. dengan cara menambahkan (int) didepan variabel yang akan diubah.

3. return value digunakan untuk mengembalikan jumlah elemen pada array yang terdapat diantara indeks l dan r. perhitungan menggunakan Divide and Conquer. pada setiap rekursif, array dibagi menjadi dua kemudian memanggil lagi totalDC. kemudian total tadi dihitung dengan rumus lsum + rsum + arr[mid].
    lsum = jumlah elemen array pada indeks l hingga mid.
    rsum = jumlah elemen array pada indeks mid+1 hingga r.
    arr[mid] = elemen pada indeks mid.

4. untuk membagi array menjadi dua bagian yang sama besar secara rekursif dan kemudian menjumlahkan elemen-elemen di tengah yang terletak pada indeks mid.

5. Program perhitungan keuntungan perusahaan dengan cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.
~~~ java 
public class Sum {

    public int elemen;
    public double keuntungan[];
    public double total;

    Sum(int elemen, double[] keuntungan) {
        this.elemen = elemen;
        this.keuntungan = keuntungan;
        this.total = 0;
    }

    double totalBF() {
        for (int i = 0; i < elemen; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC(int l, int r) {
        if (l == r)
            return keuntungan[l];
        else if (l < r) {
            int mid = (l + r) /2;
            double lsum=totalDC(l, mid-1);
            double rsum=totalDC(mid+1 ,r);
            return lsum + rsum;
        }

        return 0;
    }
}
~~~
~~~ java 
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
    }
}
~~~

### 4.5 Latihan Praktikum
~~~ java 
public class PemilihanBEM {
    public String[] kandidat = {
        "Haris", "Dian", "Rani", "Bisma"
    };

    int idx;
    public int[] banyak;
    public int[] suaraMasuk;

    PemilihanBEM(int anggota) {
        this.banyak = new int[anggota];
        this.suaraMasuk = new int[kandidat.length];
    }

    public String pilihanDC(int[] array, int l, int r) {
        if (l == r) {
            if (array[l] == 1) {
                suaraMasuk[0] += 1;
            } else if (array[l] == 2) {
                suaraMasuk[1] += 1;
            } else if (array[l] == 3) {
                suaraMasuk[2] += 1;
            } else if (array[l] == 4) {
                suaraMasuk[3] += 1;
            }
        } else {
            int mid = (l + r) / 2;
            pilihanDC(array, l, mid);
            pilihanDC(array, mid + 1, r);
            if (suaraMasuk[0] > (array.length / 2)) {
                idx = 0;
            } else if (suaraMasuk[1] > (array.length / 2)) {
                idx = 1;
            } else if (suaraMasuk[2] > (array.length / 2)) {
                idx = 2;
            } else if (suaraMasuk[3] > (array.length / 2)) {
                idx = 3;
        }
    }
    return kandidat[idx];
    }

    public void NamaKandidat() {
        int i = 0;
        while (i < kandidat.length) {
            System.out.println((i + 1) + ". " + kandidat[i]);
            i++;
        }
    }
}
~~~ 
~~~ java
import java.util.Scanner;

public class MainPemilihanBEM {
    public static void main(String[] args) {
        Scanner cinthya = new Scanner(System.in);
        System.out.println("Masukkan banyaknya pemilihan: ");
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
        System.out.println(==========================================);
    }
}
~~~






