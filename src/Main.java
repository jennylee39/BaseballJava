import java.util.Random;
import java.util.Scanner;

public class Main {
    static int MAX_NUMBER = 10;

    public static void main(String[] args) {
        // 정답을 생성한다. (0 - 9 사이의 중복되지 않는 3개의 숫자)
        int answer0;
        int answer1;
        int answer2;

        // base class library(API) vs. 3rd-party library
        Random random = new Random();

        MAX_NUMBER = 9;

        while (true) {
            answer0 = random.nextInt(MAX_NUMBER);
            answer1 = random.nextInt(MAX_NUMBER);
            answer2 = random.nextInt(MAX_NUMBER);

            if (answer0 != answer1 && answer1 != answer2 && answer2 != answer0)
                break;
        }
        System.out.println("[정답]");
        System.out.print(answer0 + " ");
        System.out.print(answer1 + " ");
        System.out.print(answer2 + " ");
        System.out.println();

        // 추측을 입력한다.
        int tryCount = 0;

        while (true) {
            tryCount++;

            int guess0;
            int guess1;
            int guess2;

            Scanner scanner = new Scanner(System.in);
            guess0 = scanner.nextInt();
            guess1 = scanner.nextInt();
            guess2 = scanner.nextInt();

            System.out.println("[추측]");
            System.out.print(guess0 + " ");
            System.out.print(guess1 + " ");
            System.out.print(guess2 + " ");
            System.out.println();

            // 결과를 계산한다.
            int strike = 0;
            int ball = 0;
            int out = 0;

            if (guess0 == answer0)
                strike++;
            else if (guess0 == answer1 || guess0 == guess2)
                ball++;
            else
                out++;

            if (guess1 == answer1)
                strike++;
            else if (guess1 == answer0 || guess1 == guess2)
                ball++;
            else
                out++;

            if (guess2 == answer2)
                strike++;
            else if (guess2 == answer0 || guess2 == guess1)
                ball++;
            else
                out++;

            System.out.println("S : " + strike + " B : " + ball + " O : " + out);

            // 3S가 아니면 돌아간다.
            if (strike == 3)
                break;
        }

        // 도전 횟수를 출력한다.
        System.out.println("도전횟수 : " + tryCount);
    }
}
