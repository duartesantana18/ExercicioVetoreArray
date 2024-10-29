/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ArrayListExercicio {
    public static void main(String[] args) {
        // Exercício 1: Adicionar e exibir elementos
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Manga");
 
        System.out.println("Lista de frutas: " + frutas);
 
        // Exercício 2: Remover um elemento
        frutas.remove(2); // Remove a terceira fruta (índice 2)
        System.out.println("Lista de frutas após remoção: " + frutas);
 
        // Exercício 3: Buscar um elemento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de uma fruta para buscar: ");
        String frutaParaBuscar = scanner.nextLine();
        boolean found = buscaFruta(frutas, frutaParaBuscar);
        if (found) {
            System.out.println(frutaParaBuscar + " está na lista.");
        } else {
            System.out.println(frutaParaBuscar + " não está na lista.");
        }
 
        // Exercício 4: Ordenar a lista de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);
        numeros.add(4);
 
        Collections.sort(numeros);
        System.out.println("Lista de números ordenada: " + numeros);
 
        // Exercício 5: Contar elementos pares
        int contagemPares = contarPares(numeros);
        System.out.println("Quantidade de números pares: " + contagemPares);
 
        scanner.close();
    }
 
    // Método para buscar uma fruta no ArrayList
    public static boolean buscaFruta(ArrayList<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }
 
    // Método para contar números pares no ArrayList
    public static int contarPares(ArrayList<Integer> numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}

