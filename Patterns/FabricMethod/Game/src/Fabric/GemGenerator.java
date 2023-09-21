package Fabric;

import Interfaces.iGameItem;
import Product.GemReward;

public class GemGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
    
}
