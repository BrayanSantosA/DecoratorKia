package decorator;
import vehicles.KiaPicanto;

public abstract class Alarms extends AccessoriesDecorator {
    KiaPicanto kiaPicanto;

    public Alarms(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }
    
    public String getDescription() {
        return kiaPicanto.getDescription() + ", Alarmas matrix";
    }

    public double Cost() {
        return kiaPicanto.Cost() + 205000;
    }
    
}
