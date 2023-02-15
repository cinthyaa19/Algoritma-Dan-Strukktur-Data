public class Array07D {
    public static void main(String[] args) {
        int banyakbunga07D[][] = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}};
        int[] harga07D = {75000, 50000, 60000, 10000};
        int[] kurang = {1, 2, 0, 5};
        long pendapatan07D = 0;
        String[] namaBunga07D = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
            
        int total07D = 0;
        for (int i = 0; i < banyakbunga07D.length; i++) {
            for (int j = 0; j < banyakbunga07D[0].length; j++) {
                total07D = total07D + banyakbunga07D[i][j];
            }
        }

        System.out.println("========================================================");
        System.out.println("Jumlah Keseluruhan Stock Bunga yang ada di seluruh Cabang : " + total07D);
        System.out.println("========================================================");
    
        System.out.println(" ");
        System.out.println("=========================================================");
        System.out.println("Jumlah Stock Berdasarkan jenis yang ada di seluruh Cabang");
        System.out.println("=========================================================");

        for (int i = 0; i < banyakbunga07D.length; i++) {
            total07D = 0;
            for (int j = 0; j < banyakbunga07D[0].length; j++) {
                total07D = total07D + banyakbunga07D[j][i];
            }
            System.out.println("bunga " + " " + namaBunga07D[i] + " : " + total07D);
        }

        System.out.println(" ");
        System.out.println("========================================================");
        System.out.println("Stock Royal Garden 1");
        System.out.println("========================================================");
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < banyakbunga07D[0].length; j++) {
                banyakbunga07D[0][j] = banyakbunga07D[0][j]-kurang[j];
                System.out.println(namaBunga07D[j]+" "+ banyakbunga07D[0][j]);
                pendapatan07D += (banyakbunga07D[0][j] * harga07D[j]);
            }                  
        }
        System.out.println("========================================================");
        System.out.println("Pendapatan Cabang Royal Garden1 Setelah Pengurangan Stock : " + "Rp " + pendapatan07D);
        System.out.println("========================================================");
    }
}
