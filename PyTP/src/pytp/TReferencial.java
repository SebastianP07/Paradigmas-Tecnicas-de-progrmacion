package pytp;

class TReferencial {

    static int m = 1;

    public static void main(String arg[]) {
        System.out.println(a1());
        System.out.println(a2());
    }

    static int dame() {
        m++;
        return m - 1;
    }

    static int hola() {
        return dame();
    }

    static int a1() {
        return m + dame();
    }

    static int a2() {
        return dame() + m;
    }
}
