package com.lab111.labwork7;

/**
 * Стан LISTENING - з'єднання очікує вхідних підключень.
 */
public class ListeningState implements ConnectionState {
    @Override
    public void open(TCPConnection connection) {
        System.out.println("[LISTENING] Прийнято вхідне з'єднання");
        System.out.println("[LISTENING] Виконується handshake...");
        connection.setState(new EstablishedState());
        System.out.println("Перехід до стану: ESTABLISHED");
    }
    
    @Override
    public void close(TCPConnection connection) {
        System.out.println("[LISTENING] Закриття прослуховування");
        connection.setState(new ClosedState());
        System.out.println("Перехід до стану: CLOSED");
    }
    
    @Override
    public void send(TCPConnection connection, String data) {
        System.out.println("[LISTENING] ПОМИЛКА: Неможливо відправити дані - з'єднання не встановлено");
    }
    
    @Override
    public void receive(TCPConnection connection) {
        System.out.println("[LISTENING] ПОМИЛКА: Неможливо отримати дані - з'єднання не встановлено");
    }
    
    @Override
    public String getStateName() {
        return "LISTENING";
    }
}

