package be.digitcom.fruitsvegatables.model.russet_potatoes;

import be.digitcom.fruitsvegatables.model.Potato;
import be.digitcom.fruitsvegatables.model.PotatoType;

public class FrontierRusset extends Potato {
    public FrontierRusset(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
