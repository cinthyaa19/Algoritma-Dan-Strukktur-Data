public class Sum {

    public int elemen;
    public double keuntungan[];
    public double total;

    Sum(int elemen, double[] keuntungan) {
        this.elemen = elemen;
        this.keuntungan = keuntungan;
        this.total = 0;
    }

    double totalBF() {
        for (int i = 0; i < elemen; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC(int l, int r) {
        if (l == r)
            return keuntungan[l];
        else if (l < r) {
            int mid = (l + r) /2;
            double lsum=totalDC(l, mid-1);
            double rsum=totalDC(mid+1 ,r);
            return lsum + rsum;
        }

        return 0;
    }
}