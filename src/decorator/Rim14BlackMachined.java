package decorator;
import vehicles.KiaPicanto;

public class Rim14BlackMachined extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public Rim14BlackMachined(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Rin aluminio 14\" negro mecanizado";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 500000;
    }
}