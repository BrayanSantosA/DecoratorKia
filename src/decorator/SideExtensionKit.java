package decorator;
import vehicles.KiaPicanto;

public class SideExtensionKit extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public SideExtensionKit(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Kit de ampliaciones laterales";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 1500000;
    }
}