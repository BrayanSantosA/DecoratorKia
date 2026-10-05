package decorator;
import vehicles.KiaPicanto;

public class Button extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public Button(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Kit botón de encendido";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 1500000;
    }
    
}
