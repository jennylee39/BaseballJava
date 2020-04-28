import java.util.Random;
import java.util.Scanner;

public class Module {
    static void printNumbers(String prefix, int[] numbers) {
        System.out.println(prefix);
        for (int i = 0; i < Main.DIGIT; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }

    /**
     * 정답을 생성한다. (0 ~9 사이의 중복되지 않는 3개의 숫자)
     * @return 생성된 정답
     */
    static int[] generateAnswers(){
        int[] answers = new int[Main.DIGIT];

        // base class library(API)  vs. 3rd-party library
        Random random = new Random();

        while (true) {
            for (int i = 0; i < Main.DIGIT; i++)
                answers[i] = random.nextInt(Main.MAX_NUMBER); // liternal

            if (answers[0] != answers[1] && answers[1] != answers[2] && answers[2] != answers[0])
                break;
        }

        return answers;
    }

    /**
     * 추측을 입력한다.
     * @return
     */
    static int[] inputGuesses() {
        int[] guesses = new int[Main.DIGIT];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Main.DIGIT; i++)
            guesses[i] = scanner.nextInt();
        return guesses;
    }
}