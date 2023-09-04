package Interfaces;

/**
 * Интерфейс, описывающий возможность возврата заказа.
 */

public interface iReturnOrder {
    
    /**
     * Метод для возврата заказа.
     */

    void returnOrder();

    /**
     * Метод для проверки возможности возврата заказа.
     * @return true - заказ можно вернуть. 
     * @return false - заказ нельзя вернуть.
     */

    boolean isReturnable();
}
