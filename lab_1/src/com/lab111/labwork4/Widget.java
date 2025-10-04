package com.lab111.labwork4;

/**
 * Абстракція для UI елемента.
 * Містить посилання на реалізацію та визначає інтерфейс високого рівня.
 */
public abstract class Widget {
    protected UIImplementor implementor;
    
    /**
     * Конструктор з вказанням реалізації.
     * 
     * @param implementor конкретна реалізація UI бібліотеки
     */
    public Widget(UIImplementor implementor) {
        this.implementor = implementor;
    }
    
    /**
     * Абстрактний метод малювання елемента.
     */
    public abstract void draw();
}

