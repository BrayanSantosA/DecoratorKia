package decorator;
import vehicles.KiaPicanto;

public class Rim14GrayMachined extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public Rim14GrayMachined(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Rin aluminio 14\" gris mecanizado";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 500000;
    }
}