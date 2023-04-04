public class bola {
    public double jari;
    public double luasPermukaanBola() {
        return ((jari * jari) * 4 * 3.14);
    }

    public double volumeBola() {
        return ((jari * jari * jari) * 4/3 * 3.14);
    }
}