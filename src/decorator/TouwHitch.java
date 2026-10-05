package decorator;
import vehicles.KiaPicanto;

public class TouwHitch extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public TouwHitch(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Enganche para remolque";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 150000;
    }
}
