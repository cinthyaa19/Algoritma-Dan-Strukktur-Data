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
