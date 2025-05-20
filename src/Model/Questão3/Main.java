package Model.Questão3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos números da série Fibonacci exibir: ");
        int n = sc.nextInt();

        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) fib[i] = 0;
            else if (i == 1) fib[i] = 1;
            else fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.print("Fibonacci: ");
        for (int i : fib) System.out.print(i + " ");
    }
}
