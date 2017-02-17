/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.TestStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.maxBy;
import java.util.stream.Stream;

/**
 *
 * @author jrudascas
 */
public class Test1 {

    public static void main(String[] arg) {
        List<Transaccion> transacciones = new ArrayList<>();
        transacciones.add(new Transaccion(10000, new Date(12313213), new Proveedor("CocaCola SA", "800228991-4", new Ciudad("Bogota", 3123123))));
        transacciones.add(new Transaccion(41400, new Date(14643213), new Proveedor("Familia SA", "800321361-2", new Ciudad("Barranquilla", 1112313))));
        transacciones.add(new Transaccion(15520, new Date(92828373), new Proveedor("CompyTem SAS", "800828293-1", new Ciudad("Medellin", 2223131))));
        transacciones.add(new Transaccion(67000, new Date(433213), new Proveedor("PanelasColombia SA", "8003213451-2", new Ciudad("Bogota", 3123123))));

        int sum;
        sum = transacciones.stream().
                filter(t -> t.getProveedor().getCiudad().equals("Bogota")).
                mapToInt(Transaccion::getPrecio).
                sum();

        Stream list = transacciones.stream().
                map(t -> t.getProveedor().getCiudad().getNombre()).
                distinct().limit(1);

        Optional<Transaccion> max = transacciones.stream().
                max(Comparator.comparingDouble(Transaccion::getPrecio));
        
        boolean transaccionMinima = transacciones.stream().
                allMatch(t -> t.getPrecio() > 10001);
        
        System.out.println("1. " + sum);
        System.out.println("2. " + list.toArray()[0]);
        System.out.println("3. " + max.get().getPrecio());
        System.out.println("4. " + transaccionMinima);
        
        //Stream a = transacciones.stream();
        //List transacciones2 = Arrays.asList(a.toArray());         
    }
}
