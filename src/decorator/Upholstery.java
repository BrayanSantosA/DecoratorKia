package decorator;
import vehicles.KiaPicanto;

public class Upholstery extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public Upholstery(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Tapete de tres piezas";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 92000;
    }
    
}
