package lt.techin.strategy;

public class ManufactureFilteringStrategy implements FilteringStrategy{

    @Override
    public boolean filter(Product product) {
        return false;
    }
}
