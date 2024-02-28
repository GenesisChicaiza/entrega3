package mates;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
// Clase Funciones.java
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Funciones {

    public static int sumaN(int n) {
        IntUnaryOperator suma = x -> IntStream.rangeClosed(0, x).sum();
        return suma.applyAsInt(n);
    }

    public static int factorial(int n) {
        IntUnaryOperator factorial = x -> IntStream.rangeClosed(1, x).reduce(1, (a, b) -> a * b);
        return factorial.applyAsInt(n);
    }

   
    public static int potencia(int base, int exponente) {
        UnaryOperator<Integer> potencia = x -> (int) Math.pow(base, x);
        return potencia.apply(exponente);
    }

    
    public static int lista(List<Integer> lista) {
        BinaryOperator<Integer> suma = (a, b) -> a + b;
        return lista.stream().reduce(0, suma);
    }

   
    public static double mediaAritme(List<Integer> lista) {
        return lista.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }

    
    public static double desviacion(List<Integer> lista) {
        double media = mediaAritme(lista);
        Function<Integer, Double> diferenciaCuadrada = x -> Math.pow(x - media, 2);
        double sumaCuadrados = lista.stream().map(diferenciaCuadrada).reduce(0.0, Double::sum);
        return Math.sqrt(sumaCuadrados / lista.size());
    }
  
   public static int pares(int n) {
    return java.util.stream.IntStream.iterate(n, i -> i - 2)
            .limit(n / 2)
            .sum();
}


public static int paresLista(List<Integer> numeros) {
    Predicate<Integer> esPar = numero -> numero % 2 == 0;
    return numeros.stream()
            .filter(esPar)
            .mapToInt(Integer::intValue)
            .sum();
}
    
    public static List<Integer> obtenerListPar(List<Integer> numeros) {
        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());
    }

   
    public static List<Integer> listPares(int n) {
        return n >= 2 ?
                obtenerListPar(
                        nRecursivo(n)
                ) :
                List.of(); 
    }

    private static List<Integer> nRecursivo(int n) {
        return n >= 2 ?
                List.of(n, nRecursivo(n - 2)).stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList()) :
                List.of(); 
    }
     
    public static int productoEscalar(List<Integer> lista1, List<Integer> lista2) {
        BinaryOperator<Integer> producto = (a, b) -> a * b;
        return IntStream.range(0, lista1.size())
                .map(i -> producto.apply(lista1.get(i), lista2.get(i)))
                .sum();
    }
 
    public static int fibonacci(int n) {
        UnaryOperator<int[]> fibonacci = fib -> new int[]{fib[1], fib[0] + fib[1]};

        return Stream.iterate(new int[]{0, 1}, fibonacci)
                .limit(n)
                .skip(n - 1)
                .findFirst()
                .orElse(new int[]{0, 1})[1];
    }



public static double cociente() {
    int decimoTercero = fibonacci(13);
    int decimoSegundo = fibonacci(12);

    return (double) decimoTercero / decimoSegundo;
}


public static double relacionFibonacci(int n) {
    int fibN = fibonacci(n);
    int fibN1 = fibonacci(n - 1);

    return (double) fibN / fibN1;
}
}

