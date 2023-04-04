import java.util.Scanner;
public class ArrayofObject2D {
    public static void main(String[] args) {
       Scanner cinthya = new Scanner(System.in);
       PersegiPanjang[][] ppArray = new PersegiPanjang[3][2];

       for(int i = 0; i < 3; i++) {
       for(int j = 0; j < 2; j++) {
            ppArray[i][j] = new PersegiPanjang();
            System.out.println("PersegiPanjang ke-["+i+"]["+j+"]");
            System.out.print("Masukkan panjang: ");
            ppArray[i][j].panjang = cinthya.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i][j].lebar = cinthya.nextInt();
       }
       }
    }
}
