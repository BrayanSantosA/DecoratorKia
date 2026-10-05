package decorator;
import vehicles.KiaPicanto;

public class bickeRock extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public bickeRock(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Porta bicicletas";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 910000;
    }
    
}
