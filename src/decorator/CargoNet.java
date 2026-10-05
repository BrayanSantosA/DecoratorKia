package decorator;
import vehicles.KiaPicanto;

public class CargoNet extends AccessoriesDecorator {
    KiaPicanto kiaPicanto;

    public CargoNet(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }
    
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Malla de carga";
    }

    public double Cost() {
        return kiaPicanto.Cost() + 110000;
    }

}
