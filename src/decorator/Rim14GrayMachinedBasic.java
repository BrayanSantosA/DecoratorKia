package decorator;
import vehicles.KiaPicanto;

public class Rim14GrayMachinedBasic extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public Rim14GrayMachinedBasic(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Rin aluminio 14\" gris mecanizado (básico)";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 450000;
    }
}