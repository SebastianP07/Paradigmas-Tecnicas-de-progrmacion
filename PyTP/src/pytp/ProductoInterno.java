package pytp;

class Vector {

    private final int n;
    private double[] data;

    public Vector(double[] data) {
        this.n = data.length;
        this.data = data;
    }

    public int length() {
        return n;
    }

    public double dot(Vector that) {
        if (this.length() != that.length()) {
            throw new IllegalArgumentException("Los vectores deben tener igual dimension");
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum = sum + (this.data[i] * that.data[i]);
        }
        return sum;
    }
}

public class ProductoInterno {

    public static void main(String arg[]) {

        double[] xdata = {1.0, 2.0, 3.0, 4.0};
        double[] ydata = {5.0, 2.0, 4.0, 1.0};

        Vector x = new Vector(xdata);
        Vector y = new Vector(ydata);

        System.out.println("<x, y>   =  " + x.dot(y));
    }
}
