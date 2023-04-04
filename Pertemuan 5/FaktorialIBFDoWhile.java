public class FaktorialIBFDoWhile {
    
    public int faktorialIBF(int n) {
        int fakto = 1;
        int i = 1;
        do {
            fakto *= i;
            i++;
        } while (i <= n);
        return fakto;
    }
}
