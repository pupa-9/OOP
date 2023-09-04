package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public void setName(String name);
    abstract public String getName();

    @Override
    public boolean isReturnOrder() {
        /**
         * Переопределение метода isReturnOrder.
         */
        return false;
    }

    @Override
    public void returnOrder() {
        // TODO Auto-generated method stub
        
    }

}
