package decorator;
import vehicles.KiaPicanto;

public abstract class AccessoriesDecorator extends KiaPicanto {
    public abstract String getDescription();
    public abstract double getCost();
}
