package com.lab111.labwork7;

/**
 * Контекст TCP з'єднання.
 * Делегує виконання операцій поточному стану.
 */
public class TCPConnection {
    private ConnectionState state;
    private String address;
    private int port;
    
    /**
     * Конструктор TCP з'єднання.
     * 
     * @param address IP адреса
     * @param port порт
     */
    public TCPConnection(String address, int port) {
        this.address = address;
        this.port = port;
        this.state = new ClosedState();
        System.out.println("Створено TCP з'єднання: " + address + ":" + port);
        System.out.println("Початковий стан: CLOSED\n");
    }
    
    /**
     * Встановлює новий стан з'єднання.
     * 
     * @param state новий стан
     */
    public void setState(ConnectionState state) {
        this.state = state;
    }
    
    /**
     * Повертає поточний стан з'єднання.
     * 
     * @return поточний стан
     */
    public ConnectionState getState() {
        return state;
    }
    
    /**
     * Відкриває з'єднання.
     */
    public void open() {
        state.open(this);
    }
    
    /**
     * Закриває з'єднання.
     */
    public void close() {
        state.close(this);
    }
    
    /**
     * Відправляє дані.
     * 
     * @param data дані для відправки
     */
    public void send(String data) {
        state.send(this, data);
    }
    
    /**
     * Отримує дані.
     */
    public void receive() {
        state.receive(this);
    }
    
    /**
     * Виводить інформацію про поточний стан.
     */
    public void printStatus() {
        System.out.println("\n--- Статус з'єднання " + address + ":" + port + " ---");
        System.out.println("Поточний стан: " + state.getStateName());
        System.out.println("-------------------------------\n");
    }
}

