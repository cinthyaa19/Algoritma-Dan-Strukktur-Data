public class Fungsi07D {
    static int total07D;
    static int stokBunga07D [][] = {
        {10,5,15,7},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9}
    };
    public static void main(String[] args) {
        String bunga07D[]={"Aglonema", "Keladi","Alocasia","Mawar"};
        String cabangToko07D[]={"Royal Garden 1","Royal Garden 2","Royal Garden 3", "Royal Garden 4"};
        System.out.println("\t\t | "+ bunga07D[0]+"\t| "+ bunga07D[1]+"\t| "+ bunga07D[2]+"\t|\t"+ bunga07D[3]+"\t|");
        tabel07D(cabangToko07D,stokBunga07D);
        System.out.println(" ");
        System.out.println("=============================================================================");
        System.out.println("\t\t\t\tJumlah Stok Bunga");
        System.out.println("=============================================================================");
        System.out.println(bunga07D[0]+" : "+stok07D(0));
        System.out.println(bunga07D[1]+" : "+stok07D(1));
        System.out.println(bunga07D[2]+" : "+stok07D(2));
        System.out.println(bunga07D[3]+" : "+stok07D(3));
    }

//soal A
    public static void tabel07D(String nama07D[], int jumlah07D[][]) {
    for(int i = 0; i < 4; i++){
        System.out.print(nama07D[i] +"   |"+"   ");
        for(int j = 0; j < 4; j++){
            System.out.print("\t"+jumlah07D[i][j]+"\t|");
        } System.out.println();
    }
    }
    
//soal b
    public static int stok07D (int x) {
        total07D = 0;
        for (int j = 0; j < stokBunga07D[0].length; j++) {
            total07D += stokBunga07D[j][x];
        } 
    return total07D;
    }
}
