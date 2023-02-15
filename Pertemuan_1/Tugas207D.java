import java.util.*;
public class Tugas207D {
    
    static Scanner cinthya = new Scanner(System.in);
    public static void main(String[] args) {
        int menu07D;
        
        do {
            System.out.println("");
            System.out.println("========== MENU ==========");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");
            menu07D = cinthya.nextInt();

            switch (menu07D) {
                case 1:
                    hitungKecepatan07D();
                    break;
                case 2:
                    hitungJarak07D();
                    break;
                case 3:
                    hitungWaktu07D();
                    break;
                case 4:
                    System.out.println("Terima telah memakai program");
                    break;
                default:
                    System.out.println("Inputan Salah!!");
                    break;
            }
        }while(menu07D != 4);
        
    }
    
    public static void hitungKecepatan07D() {
        System.out.println();
        System.out.println("Hitung Kecepatan");
        System.out.print("Masukkan Jarak/Meter   : ");
        double jarak07D = cinthya.nextDouble();
        System.out.print("Masukkan Waktu/Detik   : ");
        double waktu07D = cinthya.nextDouble();
        
        double kecepatan07D = jarak07D / waktu07D;
        System.out.println("Kecepatan : " + kecepatan07D + " m/s");
        
    }
    
    public static void hitungJarak07D() {
        System.out.println();
        System.out.println("Hitung Jarak");
        System.out.print("Masukkan Kecepatan m/s : ");
        double kecepatan07D = cinthya.nextDouble();
        System.out.print("Masukkan Waktu/Detik   : ");
        double waktu07D = cinthya.nextDouble();
        
        double jarak07D = kecepatan07D * waktu07D;
        System.out.println("Jarak : " + jarak07D + " Meter");
        
    }
    
    public static void hitungWaktu07D() {
        System.out.println();
        System.out.println("Hitung Waktu");
        System.out.print("Masukkan Jarak/Meter   : ");
        double jarak07D = cinthya.nextDouble();
        System.out.print("Masukkan Kecepatan m/s : ");
        double kecepatan07D = cinthya.nextDouble();
        
        double waktu07D = jarak07D / kecepatan07D;
        System.out.println("Waktu : " + waktu07D + " Detik");
        
    }
}
