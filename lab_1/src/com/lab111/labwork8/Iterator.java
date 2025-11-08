package com.lab111.labwork8;

/**
 * Інтерфейс ітератора для обходу колекції.
 * 
 * @param <T> тип елементів
 */
public interface Iterator<T> {
    /**
     * Перевіряє чи є наступний елемент.
     * 
     * @return true якщо є наступний елемент
     */
    boolean hasNext();
    
    /**
     * Повертає наступний елемент.
     * 
     * @return наступний елемент
     */
    T next();
    
    /**
     * Скидає ітератор на початок.
     */
    void reset();
}

