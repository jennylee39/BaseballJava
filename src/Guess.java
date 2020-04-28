import java.util.Scanner;

public class Guess {
    private int[] numbers = new int[Main.DIGIT];

    public void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Main.DIGIT; i++)
            numbers[i] = scanner.nextInt();
    }

    public void print() {
        System.out.println("[추측]");
        for (int i = 0; i < Main.DIGIT; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }

    public int at(int i) {
        return numbers[i];
    }
}