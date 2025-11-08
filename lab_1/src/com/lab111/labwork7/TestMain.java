package com.lab111.labwork7;

/**
 * Тестування шаблону State для TCP з'єднання.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №7: Шаблон State ===\n");
        
        // Створення TCP з'єднання
        TCPConnection connection = new TCPConnection("192.168.1.100", 8080);
        
        // Тест 1: Спроба відправки в закритому стані
        System.out.println("--- Тест 1: Операції в стані CLOSED ---");
        connection.send("Hello");
        connection.receive();
        
        // Тест 2: Відкриття з'єднання (CLOSED -> LISTENING)
        System.out.println("\n--- Тест 2: Відкриття з'єднання ---");
        connection.open();
        connection.printStatus();
        
        // Тест 3: Спроба відправки в стані LISTENING
        System.out.println("--- Тест 3: Операції в стані LISTENING ---");
        connection.send("Data in listening");
        
        // Тест 4: Прийняття вхідного з'єднання (LISTENING -> ESTABLISHED)
        System.out.println("\n--- Тест 4: Прийняття вхідного з'єднання ---");
        connection.open();
        connection.printStatus();
        
        // Тест 5: Відправка і отримання в стані ESTABLISHED
        System.out.println("--- Тест 5: Передача даних ---");
        connection.send("Hello, Server!");
        connection.receive();
        connection.send("Another message");
        
        // Тест 6: Спроба повторного відкриття
        System.out.println("\n--- Тест 6: Спроба повторного відкриття ---");
        connection.open();
        
        // Тест 7: Закриття з'єднання (ESTABLISHED -> CLOSED)
        System.out.println("\n--- Тест 7: Закриття з'єднання ---");
        connection.close();
        connection.printStatus();
        
        // Тест 8: Спроба відправки після закриття
        System.out.println("--- Тест 8: Операції після закриття ---");
        connection.send("Should fail");
        connection.close(); // Повторне закриття
        
        System.out.println("\n=== Тестування завершено ===");
    }
}

