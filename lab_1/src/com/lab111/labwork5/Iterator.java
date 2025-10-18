package com.lab111.labwork5;

/**
 * Інтерфейс ітератора для обходу колекції.
 */
public interface Iterator {
    /**
     * Перевіряє чи є наступний елемент.
     * 
     * @return true якщо наступний елемент існує
     */
    boolean hasNext();
    
    /**
     * Повертає наступний елемент.
     * 
     * @return наступний елемент колекції
     */
    String next();
}



