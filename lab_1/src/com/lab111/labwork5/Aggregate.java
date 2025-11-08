package com.lab111.labwork5;

/**
 * Інтерфейс агрегату для створення ітераторів.
 */
public interface Aggregate {
    /**
     * Створює простий ітератор для послідовного обходу.
     * 
     * @return ітератор для обходу
     */
    Iterator createIterator();
    
    /**
     * Створює ітератор з фільтрацією по мінімальній довжині.
     * 
     * @param minLength мінімальна довжина рядка
     * @return ітератор з фільтрацією
     */
    Iterator createFilteredIteratorByLength(int minLength);
    
    /**
     * Створює ітератор з фільтрацією по першій літері.
     * 
     * @param firstChar перша літера для фільтрації
     * @return ітератор з фільтрацією
     */
    Iterator createFilteredIteratorByChar(char firstChar);
}





