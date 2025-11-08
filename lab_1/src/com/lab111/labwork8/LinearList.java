package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.List;

/**
 * Лінійний список об'єктів з підтримкою різних типів ітераторів.
 * Використовує Factory Method для створення ітераторів.
 * 
 * @param <T> тип елементів у списку
 */
public class LinearList<T> {
    private List<T> items;
    
    /**
     * Конструктор порожнього списку.
     */
    public LinearList() {
        this.items = new ArrayList<>();
        System.out.println("Створено новий лінійний список");
    }
    
    /**
     * Додає елемент до списку.
     * 
     * @param item елемент для додавання
     */
    public void add(T item) {
        items.add(item);
        System.out.println("Додано елемент: " + item);
    }
    
    /**
     * Отримує елемент за індексом.
     * 
     * @param index індекс елемента
     * @return елемент
     */
    public T get(int index) {
        return items.get(index);
    }
    
    /**
     * Повертає розмір списку.
     * 
     * @return кількість елементів
     */
    public int size() {
        return items.size();
    }
    
    /**
     * Factory Method для створення ітератора.
     * Створює ітератор відповідного типу.
     * 
     * @param type тип ітератора (FORWARD або REVERSE)
     * @return створений ітератор
     */
    public Iterator<T> createIterator(IteratorType type) {
        System.out.println("Створення ітератора типу: " + type);
        switch (type) {
            case FORWARD:
                return new ForwardIterator<>(this);
            case REVERSE:
                return new ReverseIterator<>(this);
            default:
                throw new IllegalArgumentException("Невідомий тип ітератора: " + type);
        }
    }
}

