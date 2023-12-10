package Strategy;

public class Main {
    public static void main(String[] args) {
        int[] Array = {7, 2, 3, 4, 5};
        Context context = new Context(new CountingSort());
        context.executeSorting(Array);
    }
}