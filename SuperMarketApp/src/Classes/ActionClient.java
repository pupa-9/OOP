package Classes;

/**
 * Описывающий класс акционного клиента.
 */

public class ActionClient {
    private String actionName;
    private int clientId;
    private static int participantsCount;

    /**
     * Конструктор класса ActionClient.
     * @param actionName - название акции.
     * @param clientId - id клиента.
     */

    public ActionClient(String actionName, int clientId) {
        this.actionName = actionName;
        this.clientId = clientId;
    }

    /**
     * Метод для получения названия акции.
     * @return - возвращает название акции.
     */

    public String getActionName() {
        return actionName;
    }
    
    /**
     * Метод для получения id клиента.
     * @return - возвращает id клиента.
     */

    public int getClientId() {
        return clientId;
    }

    /**
     * Метод для получения количества участников акции.
     * @return - возвращает количесто участников акции.
     */

    public static int getParticipantsCount() {
        return participantsCount;
    }
}
