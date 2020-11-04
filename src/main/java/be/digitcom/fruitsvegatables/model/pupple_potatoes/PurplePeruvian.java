package be.digitcom.fruitsvegatables.model.pupple_potatoes;

import be.digitcom.fruitsvegatables.model.Potato;
import be.digitcom.fruitsvegatables.model.PotatoType;

public class PurplePeruvian extends Potato {
    public PurplePeruvian(double weight, PotatoType type) {
        super(weight, type);
    }

    public PurplePeruvian(double weight) {
        super(weight);
        this.type = PotatoType.BLUE;
    }
}
