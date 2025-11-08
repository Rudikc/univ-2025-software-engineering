package com.lab111.labwork7;

/**
 * Стан ESTABLISHED - з'єднання встановлено, можна передавати дані.
 */
public class EstablishedState implements ConnectionState {
    @Override
    public void open(TCPConnection connection) {
        System.out.println("[ESTABLISHED] ПОМИЛКА: З'єднання вже встановлено");
    }
    
    @Override
    public void close(TCPConnection connection) {
        System.out.println("[ESTABLISHED] Закриття з'єднання");
        System.out.println("[ESTABLISHED] Відправка FIN пакету...");
        connection.setState(new ClosedState());
        System.out.println("Перехід до стану: CLOSED");
    }
    
    @Override
    public void send(TCPConnection connection, String data) {
        System.out.println("[ESTABLISHED] Відправка даних: \"" + data + "\"");
        System.out.println("[ESTABLISHED] Дані успішно відправлено");
    }
    
    @Override
    public void receive(TCPConnection connection) {
        System.out.println("[ESTABLISHED] Очікування вхідних даних...");
        System.out.println("[ESTABLISHED] Дані отримано успішно");
    }
    
    @Override
    public String getStateName() {
        return "ESTABLISHED";
    }
}

