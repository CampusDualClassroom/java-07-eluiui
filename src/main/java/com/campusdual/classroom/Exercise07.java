package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(50);

    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 10; i >= 1; i--) {
            lista.add(i);
        }

        int posicion = lista.indexOf(num);

        if (posicion !=-1) {
            System.out.println(num + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println(num + " no se encuentra en la lista.");
        }

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = num; i >= 1; i--) {
            int numero=sum;
            sum = i+sum;

            System.out.println(i+"+"+numero+"="+sum);
        }
        System.out.println("Resultado "+sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.print("Los numeros positivos son: ");
        for (int i = num; i >= 1; i--) {
            if (i!=1){
                System.out.print(i+", ");
            }else {
                System.out.print(i);
            }

        }
    }

}
