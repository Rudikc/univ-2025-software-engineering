package com.lab111.labwork7;

/**
 * Інтерфейс стану TCP з'єднання.
 * Визначає операції, які можуть виконуватися в різних станах.
 */
public interface ConnectionState {
    /**
     * Відкриває з'єднання.
     * 
     * @param connection контекст TCP з'єднання
     */
    void open(TCPConnection connection);
    
    /**
     * Закриває з'єднання.
     * 
     * @param connection контекст TCP з'єднання
     */
    void close(TCPConnection connection);
    
    /**
     * Відправляє дані через з'єднання.
     * 
     * @param connection контекст TCP з'єднання
     * @param data дані для відправки
     */
    void send(TCPConnection connection, String data);
    
    /**
     * Отримує дані через з'єднання.
     * 
     * @param connection контекст TCP з'єднання
     */
    void receive(TCPConnection connection);
    
    /**
     * Повертає назву поточного стану.
     * 
     * @return назва стану
     */
    String getStateName();
}

