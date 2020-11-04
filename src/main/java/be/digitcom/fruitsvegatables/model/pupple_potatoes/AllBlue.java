package be.digitcom.fruitsvegatables.model.pupple_potatoes;


import be.digitcom.fruitsvegatables.model.Potato;
import be.digitcom.fruitsvegatables.model.PotatoType;

public class AllBlue extends Potato {
    public AllBlue(double weight, PotatoType type) {
        super(weight, type);
    }

    public AllBlue(double weight) {
        super(weight);
        this.type = PotatoType.BLUE;
    }
}
