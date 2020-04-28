public class Main {

    public static final int MAX_NUMBER = 10;
    public static final int DIGIT = 3;

    public static void main(String[] args) {
        Answer answer = new Answer();
        answer.generate();
        answer.print();

        int tryCount = 0;
        while (true){
            tryCount++;

            Guess guess = new Guess();
            guess.input();
            guess.print();

            Result result = new Result();
            result.calculate(answer, guess);
            result.print();

            if (result.isGood())
                break;
        }

        System.out.println("도전횟수 : " + tryCount);
    }
}