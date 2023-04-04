import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner cinthya = new Scanner(System.in);
       
        System.out.print("Masukkan Panjang Array: ");
        int j = cinthya.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[j];
        
        for(int i = 0; i < j; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = cinthya.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = cinthya.nextInt();
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
