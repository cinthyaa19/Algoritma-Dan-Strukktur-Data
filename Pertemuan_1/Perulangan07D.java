import java.util.Scanner;

public class Perulangan07D {
    public static void main(String[] args) {
        Scanner cinthya = new Scanner (System.in);
        int nim07D,i07D;
        String l07D;

        System.out.print("Masukkan NIM: ");
        nim07D = cinthya.nextInt();
        int a = nim07D % 100;

        if(a<10){
            a+=10;
        }
        System.out.println("2 Angka Terakhir NIM = " + a);

        l07D = " ";
        int h = 0;
        String[] hari={"Senin","Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        for (i07D = 0; i07D<a; i07D++){
            if (h > 6){
                h = 0;
            }
                l07D = l07D+hari[h]+" ";
                h++;
        }
        System.out.println(l07D);
    }
}
