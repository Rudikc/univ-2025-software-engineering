package com.lab111.labwork7;

/**
 * Стан CLOSED - з'єднання закрито.
 */
public class ClosedState implements ConnectionState {
    @Override
    public void open(TCPConnection connection) {
        System.out.println("[CLOSED] Ініціалізація нового з'єднання...");
        connection.setState(new ListeningState());
        System.out.println("Перехід до стану: LISTENING");
    }
    
    @Override
    public void close(TCPConnection connection) {
        System.out.println("[CLOSED] З'єднання вже закрито");
    }
    
    @Override
    public void send(TCPConnection connection, String data) {
        System.out.println("[CLOSED] ПОМИЛКА: Неможливо відправити дані - з'єднання закрито");
    }
    
    @Override
    public void receive(TCPConnection connection) {
        System.out.println("[CLOSED] ПОМИЛКА: Неможливо отримати дані - з'єднання закрито");
    }
    
    @Override
    public String getStateName() {
        return "CLOSED";
    }
}

