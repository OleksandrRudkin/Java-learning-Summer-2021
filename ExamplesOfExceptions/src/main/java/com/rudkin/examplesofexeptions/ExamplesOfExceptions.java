package main.java.com.rudkin.examplesofexeptions;

public class ExamplesOfExceptions {

    public static double sqr(double arg) {
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;
        } else if (time % 2 == 1) {
            while (true) ;
        } else {
            throw new RuntimeException();
        }
    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }

    public static void f() {
        System.err.println(".   #2.in");
        g();
        System.err.println(".   #2.out");
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h();
        System.err.println(".   .   #3.out");
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.RETURN");
            return;
        }
        System.err.println(".   .   .   #4.out");
    }

    public static int f1() {
        try {
            throw new RuntimeException();
        } finally {
            return 1;
        }
    }

    public static void ex1() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2.1");
            try {
                System.err.print(" 2.2");
                if (true) {
                    throw new Error();
                }
                System.err.print(" 2.3");
            } catch (Throwable t) {
                System.err.print(" 2.4");
            }
            System.err.print(" 2.5");
        } catch (Error e) {
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }

    public static void ex2() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {
                    throw new Exception();
                }
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
        System.err.println();
    }

    public static void ex3() throws Throwable {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}


