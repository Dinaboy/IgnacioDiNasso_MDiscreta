import java.util.Scanner;

public class SecuenciaRecursiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer elemento de la sucesión: ");
        int firstElement = scanner.nextInt();
        System.out.print("Ingrese la posición del primer elemento: ");
        int firstPosition = scanner.nextInt();


        System.out.print("Ingrese el segundo elemento de la sucesión: ");
        int secondElement = scanner.nextInt();
        System.out.print("Ingrese la posición del segundo elemento: ");
        int secondPosition = scanner.nextInt();


        System.out.print("Ingrese el número de términos de la sucesión que desea generar: ");
        int n = scanner.nextInt();


        int[] sequence = new int[n];
        sequence[firstPosition - 1] = firstElement;
        sequence[secondPosition - 1] = secondElement;

        generateSequence(sequence, firstPosition - 1, secondPosition - 1, n);


        System.out.println("Sucesión de izquierda a derecha:");
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.println("Sucesión de derecha a izquierda:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(sequence[i] + " ");
        }
        System.out.println();

        scanner.close();
    }


    public static void generateSequence(int[] sequence, int firstPos, int secondPos, int n) {
        if (secondPos >= n) return;
        if (secondPos + 1 < n) {
            sequence[secondPos + 1] = sequence[secondPos] + sequence[firstPos];
            generateSequence(sequence, firstPos + 1, secondPos + 1, n);
        }
    }
}
