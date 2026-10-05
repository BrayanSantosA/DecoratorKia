package decorator;
import vehicles.KiaPicanto;

public class ParkSensor extends AccessoriesDecorator {
    private KiaPicanto kiaPicanto;

    public ParkSensor(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Sensor de parqueo";
    }

    @Override
    public double Cost() {
        return kiaPicanto.Cost() + 150000;
    }
    
}
