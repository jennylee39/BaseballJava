import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int MAX_NUMBER = 10;
    public static final int DIGIT = 3;

    public static void main(String[] args) {
        // 정답을 생성한다. (0 ~9 사이의 중복되지 않는 3개의 숫자)
        int[] answers = new int[DIGIT];

        // base class library(API)  vs. 3rd-party library
        Random random = new Random();

        while (true) {
            for (int i = 0; i < DIGIT; i++)
                answers[i] = random.nextInt(MAX_NUMBER); // liternal

            if (answers[0] != answers[1] && answers[1] != answers[2] && answers[2] != answers[0])
                break;
        }

        System.out.println("[정답]");
        for (int i = 0; i < DIGIT; i++)
            System.out.print(answers[i] + " ");
        System.out.println();


        int tryCount = 0;

        while (true){
            tryCount++;

            // 추측을 입력한다.
            int[] guesses = new int[DIGIT];

            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < DIGIT; i++)
                guesses[i] = scanner.nextInt();

            System.out.println("[추측]");
            for (int i = 0; i < DIGIT; i++)
                System.out.print(guesses[i] + " ");
            System.out.println();


            // 결과를 계산한다.
            int strike = 0;
            int ball = 0;
            int out = 0;

            for (int i = 0; i < DIGIT; i++) {
                int j = (i + 1) % DIGIT; // (2+1) % 3 = 0
                int k = (i + 2) % DIGIT; // (2+2) % 3 = 1

                if (guesses[i] == answers[i])
                    strike++;
                else if (guesses[i] == answers[j] || guesses[i] == answers[k])
                    ball++;
                else
                    out++;
            }

            System.out.println("S:" + strike + " B:" + ball + " O:" + out);

            // 3S가 아니면 돌아간다.
            if (strike == DIGIT)
                break;
        }


        // 도전횟수를 출력한다.
        System.out.println("도전횟수 : " + tryCount);
    }
}
