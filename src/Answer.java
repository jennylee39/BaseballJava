import java.util.Random;

public class Answer extends NumberContainer {
    void generate(){
        Random random = new Random();

        while (true) {
            for (int i = 0; i < Main.DIGIT; i++)
                numbers[i] = random.nextInt(Main.MAX_NUMBER); // literal

            if (numbers[0] != numbers[1] && numbers[1] != numbers[2] && numbers[2] != numbers[0])
                break;
        }
    }

    @Override
    String getPrefix(){
        return "[정답]";
    }
}