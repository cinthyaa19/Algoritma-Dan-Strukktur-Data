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
            System.out.println("        Hotel       ");
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

