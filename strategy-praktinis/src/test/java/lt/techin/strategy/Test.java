package lt.techin.strategy;

public class Test extends BaseWarehouseTests{
    @Override
    Warehouse getWarehouse() {
        return new WarehouseImpl();
    }

    @Override
    FilteringStrategy getManufacturerFilteringStrategy(String manufacturer) {
        return null;
    }

    @Override
    FilteringStrategy getMaxPriceFilteringStrategy(double maxPrice) {
        return null;
    }
}
