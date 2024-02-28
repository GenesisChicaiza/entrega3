package aplicacion;

import java.util.Arrays;
import java.util.List;

import mates.Funciones;

public class Principal {

    public static void main(String[] args) {
        
        int resultadoSuma = FuncionesMatematicas.sumaN(5);
        System.out.println("La suma es: " + resultadoSuma);
        
        int resultadoFactorial = FuncionesMatematicas.factorial(5);
        System.out.println("El factorial es: " + resultadoFactorial);
        
        double resultadoPotencia = FuncionesMatematicas.potencia(2, 3);
        System.out.println("La potencia es: " + resultadoPotencia);
        
        List<Double> listaNumeros = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        double sumaResult = FuncionesMatematicas.suma(listaNumeros);
        System.out.println("La suma de la lista es: " + sumaResult);
        
        double resultadoMedia = FuncionesMatematicas.mediaAritmetica(listaNumeros);
        System.out.println("La media aritmetica es: " + resultadoMedia);
        
        double resultadoDesviacion = FuncionesMatematicas.desviacion(listaNumeros);
        System.out.println("La desviacion tipica es: " + resultadoDesviacion);
        
        int resultadoSumaParesHastaN = FuncionesMatematicas.pares(9);
        System.out.println("La suma de los primeros numeros pares hasta 9 es: " + resultadoSumaParesHastaN);
        
        List<Integer> listaEnteros = Arrays.asList(1, 2, 3, 4);
        int resultadoSumaParesLista = FuncionesMatematicas.paresLista(listaEnteros);
        System.out.println("La suma de los elementos pares de la lista es: " + resultadoSumaParesLista);
        
        List<Integer> listaInicial = Arrays.asList(1, 2, 6, 11);
        List<Integer> listaPares = FuncionesMatematicas.obtenerListPar(listaInicial);
        System.out.println("La lista de numeros pares es: " + listaPares);

        int n = 9;
        List<Integer> listaParesHastaN = FuncionesMatematicas.listPares(n);
        System.out.println("La lista de los primeros numeros pares hasta " + n + " es: " + listaParesHastaN);

        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(2, 4, 6);
        int resultadoProductoEscalar = FuncionesMatematicas.productoEscalar(lista1, lista2);
        System.out.println("Producto escalar: " + resultadoProductoEscalar);

        int g = 7;
        int resultadoFibonacci = FuncionesMatematicas.fibonacciNesimo(g);
        System.out.println("Fibonacci(" + g + ") = " + resultadoFibonacci);
     
        double cociente = FuncionesMatematicas.cocienteDecimoTerceroDecimoSegundo();
        double razonAurea = 1 + Math.sqrt(5) / 2;

        System.out.println("Cociente: " + cociente);
        System.out.println("1 + √5/2: " + razonAurea);
        System.out.println("Comparacion: " + (cociente == razonAurea));

        int i = 20; 
        double relacion = FuncionesMatematicas.relacionFibonacciRazonAurea(i);
        System.out.println("Relacion Fibonacci: " + relacion);
    }

}

    

