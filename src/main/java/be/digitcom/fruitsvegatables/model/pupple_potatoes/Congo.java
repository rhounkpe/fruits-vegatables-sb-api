package be.digitcom.fruitsvegatables.model.pupple_potatoes;

import be.digitcom.fruitsvegatables.model.Potato;
import be.digitcom.fruitsvegatables.model.PotatoType;

public class Congo extends Potato {
    public Congo(double weight) {
        super(weight);
        this.type = PotatoType.BLUE;
    }
}
