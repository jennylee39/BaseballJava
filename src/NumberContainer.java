public abstract class NumberContainer {
    protected int[] numbers = new int[Main.DIGIT];

    public int at(int i) {
        return numbers[i];
    }

    void print() {
        System.out.println(getPrefix());
        for (int i = 0; i < Main.DIGIT; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }

    // abstract function
    abstract String getPrefix();
}