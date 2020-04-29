import java.util.Scanner;

public class Guess extends NumberContainer {
    public void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Main.DIGIT; i++)
            numbers[i] = scanner.nextInt();
    }

    @Override
    String getPrefix(){
        return "[추측]";
    }
}