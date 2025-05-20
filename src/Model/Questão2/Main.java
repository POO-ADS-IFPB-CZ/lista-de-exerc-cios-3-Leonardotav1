package Model.Questão2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        while (numeros.size() < 6) {
            System.out.print("Digite um número de 1 a 60: ");
            int n = sc.nextInt();
            if (n < 1 || n > 60) {
                System.out.println("Número inválido.");
            } else if (!numeros.add(n)) {
                System.out.println("Número repetido.");
            }
        }

        List<Integer> lista = new ArrayList<>(numeros);
        Collections.sort(lista);
        System.out.println("Números da Mega-Sena: " + lista);
    }
}

