package lt.techin.strategy;

public class FilteringStrategyByPrice implements FilteringStrategy {

    @Override
    public boolean filter(Product product) {
        return false;
    }
}
