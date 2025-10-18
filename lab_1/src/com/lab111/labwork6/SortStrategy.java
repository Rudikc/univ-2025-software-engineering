package com.lab111.labwork6;

import java.util.Comparator;
import java.util.List;

/**
 * Інтерфейс стратегії сортування.
 * 
 * @param <T> тип елементів для сортування
 */
public interface SortStrategy<T> {
    /**
     * Сортує список елементів за вказаним компаратором.
     * 
     * @param data список для сортування
     * @param comparator компаратор для порівняння елементів
     */
    void sort(List<T> data, Comparator<T> comparator);
}

