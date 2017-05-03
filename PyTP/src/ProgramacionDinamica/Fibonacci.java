package ProgramacionDinamica;

public class Fibonacci {

    public static long[] tabla;
    
    public static void main(String[] args) {
        int numero = 1000;
        tabla = new long[numero+1];
        long time1 = System.currentTimeMillis();
        System.out.println("Fibonacci(" + numero + ") = " + fib(numero));
        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) / 1000);
    }    

    public static long fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        if (tabla[n] == 0) {
            tabla[n] = fib(n - 1) + fib(n - 2);            
        } 
        
        return tabla[n];
    }
}
