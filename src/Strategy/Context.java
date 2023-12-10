package Strategy;

public class Context {
    private final SortingStrategyInterface sortingStrategyInterface;

    public Context(SortingStrategyInterface sortingStrategyInterface){
        super();
        this.sortingStrategyInterface = sortingStrategyInterface;
    }

    public void executeSorting(int[] a){
        sortingStrategyInterface.sort(a);
    }
}
