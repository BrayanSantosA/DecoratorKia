package decorator;
import vehicles.KiaPicanto;

public class Bolts extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public Bolts(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Pernos de seguridad";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 156100;
    }
    
}
