package guru.qa;

public class Practice {

    public static void main(String[] args) {
        int a = 15;
        int b = 13;
        double c = -7.5;
        double d = 10.13;
        int e = 15;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - d = " + (a - d));
        System.out.println("c / a = " + (c / a));
        System.out.println("d * c = " + (d * c));

        byte byte0 = 127;
        byte byte1 = 2;
        System.out.println("byte0 + byte1 = " + (byte0 + byte1));

        if (a > e) {
            System.out.println(a + " > " + e);
        } else if (a < e) {
            System.out.println(a + " < " + e);
        } else {
            System.out.println(a + " = " + e);
        }


    }
}
