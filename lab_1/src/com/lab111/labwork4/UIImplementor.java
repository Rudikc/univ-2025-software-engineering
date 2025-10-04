package com.lab111.labwork4;

/**
 * Інтерфейс реалізації для UI бібліотек.
 * Визначає примітивні операції для малювання елементів.
 */
public interface UIImplementor {
    /**
     * Малює кнопку засобами бібліотеки.
     * 
     * @param label текст на кнопці
     */
    void drawButton(String label);
    
    /**
     * Малює вікно засобами бібліотеки.
     * 
     * @param title заголовок вікна
     */
    void drawWindow(String title);
}

