package be.digitcom.fruitsvegatables.model.russet_potatoes;


import be.digitcom.fruitsvegatables.model.Potato;
import be.digitcom.fruitsvegatables.model.PotatoType;

public class RussetBurbank extends Potato {
    public RussetBurbank(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
