import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int MAX_NUMBER = 10;
    public static final int DIGIT = 3;

    public static void main(String[] args) {
        int[] answers = Module.generateAnswers();
        Module.printNumbers("[정답]", answers);

        int tryCount = 0;
        while (true){
            tryCount++;

            int[] guesses = Module.inputGuesses();
            Module.printNumbers("[추측]", guesses);

            Result result = new Result();
            calculateResult(result, answers, guesses);
            printResult(result);

            if (isGoodResult(result))
                break;
        }

        System.out.println("도전횟수 : " + tryCount);
    }

    /**
     * 결과를 계산한다.
     * @param result 계산할 결과
     * @param answers
     * @param guesses
     */
    private static void calculateResult(Result result, int[] answers, int[] guesses) {
        for (int i = 0; i < DIGIT; i++) {
            int j = (i + 1) % DIGIT; // (2+1) % 3 = 0
            int k = (i + 2) % DIGIT; // (2+2) % 3 = 1

            if (guesses[i] == answers[i])
                result.strike++;
            else if (guesses[i] == answers[j] || guesses[i] == answers[k])
                result.ball++;
            else
                result.out++;
        }
    }

    private static void printResult(Result result) {
        System.out.println("S:" + result.strike + " B:" + result.ball + " O:" + result.out);
    }

    private static boolean isGoodResult(Result result) {
        return result.strike == DIGIT;
    }
}