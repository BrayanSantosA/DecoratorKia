package decorator;
import vehicles.KiaPicanto;

public abstract class Rim13 extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public Rim13(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Rines de 13 pulgadas";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 350000;
    }
}
