package com.lab111.labwork6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Контейнер для зберігання та сортування елементів.
 * 
 * @param <T> тип елементів у контейнері
 */
public class Container<T> {
    private List<T> data;
    private SortStrategy<T> strategy;
    
    /**
     * Конструктор контейнера.
     */
    public Container() {
        this.data = new ArrayList<>();
    }
    
    /**
     * Встановлює стратегію сортування.
     * 
     * @param strategy стратегія для використання
     */
    public void setStrategy(SortStrategy<T> strategy) {
        this.strategy = strategy;
        System.out.println("Стратегію сортування змінено");
    }
    
    /**
     * Додає елемент до контейнера.
     * 
     * @param item елемент для додавання
     */
    public void add(T item) {
        data.add(item);
    }
    
    /**
     * Сортує елементи контейнера.
     * 
     * @param comparator компаратор для порівняння елементів
     */
    public void sort(Comparator<T> comparator) {
        if (strategy == null) {
            System.out.println("Стратегія не встановлена!");
            return;
        }
        strategy.sort(data, comparator);
    }
    
    /**
     * Повертає список елементів.
     * 
     * @return список елементів
     */
    public List<T> getData() {
        return data;
    }
    
    /**
     * Виводить вміст контейнера.
     */
    public void print() {
        System.out.println("Вміст контейнера: " + data);
    }
}



