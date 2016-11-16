package t2;

public class Adder extends Arithmetic {
    public boolean check(Integer a, Integer b) {
        return a.compareTo(b) == 0 ||
                a.compareTo(b) == 1;
    }
}
