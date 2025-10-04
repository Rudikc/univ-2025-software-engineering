package com.lab111.labwork3;

/**
 * Інтерфейс для роботи з зображеннями.
 * Визначає загальний інтерфейс для RealImage та SecureImageProxy.
 */
public interface Image {
    /**
     * Отримує колір пікселя за координатами.
     * 
     * @param x координата x
     * @param y координата y
     * @return колір пікселя
     */
    String getColor(int x, int y);
}

