public class Tugas107D {
    public static void main(String[] args) {
        String customer07D[] = {"Ani","Budi","Bina","Cita"};
        int berat07D[] = {4,15,6,11};
        int hargaCustomer07D[] = new int[4];
        int totalHarga07D=0, pendapatan07D=0;

        for (int i = 0; i< customer07D.length; i++){
            if (berat07D[i] > 10){
                totalHarga07D += berat07D[i]*4500*95/100;
                hargaCustomer07D[i] = totalHarga07D;
            }else {
                totalHarga07D += berat07D[i]*4500;
                hargaCustomer07D[i] = totalHarga07D;
            }
            System.out.printf("Customer %s - %d kg laundry - total harga = Rp.%,d", customer07D[i], berat07D[i],hargaCustomer07D[i]);
            System.out.println();
            totalHarga07D=0;
            pendapatan07D+=hargaCustomer07D[i];
        }
    }
}
    
