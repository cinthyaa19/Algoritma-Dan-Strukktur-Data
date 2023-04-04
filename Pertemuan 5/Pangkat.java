public class Pangkat {
    
public int nilai,pangkat;

Pangkat(int n, int p) {
    nilai = n;
    pangkat = p;
}

public void tampil() {
    System.out.println("Nilai   : "+this.nilai);
    System.out.println("Pangkat   : "+this.pangkat);
}

public int pangkatBF(int a, int n) {
    int hasil = 1;
    for (int i = 0; i < n; i++) {
        hasil = hasil * a;
    }
    return hasil;
}

public int pangkatDC(int a, int n) {
    if (n==0) {
        return 1;
    }
    else 
    {
        if(n%2==1)//builangan ganjil
            return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
        else//bilangan genap
            return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
    }
}
}
