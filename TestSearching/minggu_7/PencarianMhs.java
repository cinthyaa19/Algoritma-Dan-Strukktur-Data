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
