package com.exercicio.teste;
import com.BinarySearch;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Iniciando busca binária...");

        int[] array = {1, 2, 3, 4, 5};
        int element = 3;
        int index = BinarySearch.binarySearch(array, element);
        if (index != -1) {
            System.out.println("Elemento encontrado no índice: " + index);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
}