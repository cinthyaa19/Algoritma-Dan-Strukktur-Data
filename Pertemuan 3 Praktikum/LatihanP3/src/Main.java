import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Kerucut[] kArray = new Kerucut[1];
        Limas[] lArray = new Limas[1];
        bola[] bArray = new bola[1];
        
        Scanner cinthya1 = new Scanner(System.in);
        Scanner cinthya2 = new Scanner(System.in);
        Scanner cinthya3 = new Scanner(System.in);
        
        for(int i = 0; i < 1; i++){
            //Kerucut
            kArray[i] = new Kerucut();
            System.out.println("Menghitung Luas Permukaan dan Volume Kerucut");
            System.out.print("Masukkan Jari-jari Kerucut: ");
            kArray[i].jari = cinthya1.nextInt();
            System.out.print("Masukkan Sisi Miring Kerucut: ");
            kArray[i].sisiMiring = cinthya1.nextInt();
        }
            
        for(int i = 0; i < 1; i++){    
            //Limas
            lArray[i] = new Limas();
            System.out.println("Menghitung Luas Permukaan dan Volume Limas");
            System.out.print("Masukkan Sisi Alas Limas: ");
            lArray[i].panjangSisi = cinthya2.nextInt();
            System.out.print("Masukkan Tinggi Limas: ");
            lArray[i].tinggi = cinthya2.nextInt();
        }
        
        for(int i = 0; i < 1; i++){
            //Bola
            bArray[i] = new bola();
            System.out.println("Menghitung Luas Permukaan dan Volume Bola");
            System.out.print("Masukkan Jari-jari Bola: ");
            bArray[i].jari= cinthya3.nextInt();
        }
        
        for(int i = 0; i < 1; i++){
            System.out.println("Luas Permukaan Kerucut" + kArray[i].luasPermukaanKerucut());
        } 
    }
}

