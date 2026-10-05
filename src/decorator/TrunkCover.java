package decorator;
import vehicles.KiaPicanto;

public class TrunkCover extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public TrunkCover(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Cubre baúl";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 250000;
    }
}