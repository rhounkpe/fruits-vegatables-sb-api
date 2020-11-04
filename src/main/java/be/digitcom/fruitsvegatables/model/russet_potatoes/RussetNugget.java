package be.digitcom.fruitsvegatables.model.russet_potatoes;


import be.digitcom.fruitsvegatables.model.Potato;
import be.digitcom.fruitsvegatables.model.PotatoType;

public class RussetNugget extends Potato {
    public RussetNugget(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
