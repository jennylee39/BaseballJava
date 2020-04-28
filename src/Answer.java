import java.util.Random;

public class Answer {
    private int[] numbers = new int[Main.DIGIT];

    void generate(){
        Random random = new Random();

        while (true) {
            for (int i = 0; i < Main.DIGIT; i++)
                numbers[i] = random.nextInt(Main.MAX_NUMBER); // liternal

            if (numbers[0] != numbers[1] && numbers[1] != numbers[2] && numbers[2] != numbers[0])
                break;
        }
    }

    void print() {
        System.out.println("[정답]");
        for (int i = 0; i < Main.DIGIT; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }

    public int at(int i) {
        return numbers[i];
    }
}
