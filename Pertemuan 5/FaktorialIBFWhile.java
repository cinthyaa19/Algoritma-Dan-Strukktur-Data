public class FaktorialIBFWhile {
    
    public int faktorialIBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }
}