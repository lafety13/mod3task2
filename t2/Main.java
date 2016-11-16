package t2;

public class Main {
    public static void main(String[] args) {
        Adder ad = new Adder();
        System.out.println(ad.add(2, 3));

        System.out.println(ad.check(100, 50));
        System.out.println(ad.check(100, 100));
        System.out.println(ad.check(200, 300));
    }
}
