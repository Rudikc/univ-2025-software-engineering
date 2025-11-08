package com.lab111.labwork9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Клас для представлення рядка реляційної таблиці.
 */
public class Row {
    private List<String> values;
    
    /**
     * Конструктор рядка з масиву значень.
     * 
     * @param values значення комірок рядка
     */
    public Row(String... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
    }
    
    /**
     * Конструктор рядка зі списку значень.
     * 
     * @param values список значень
     */
    public Row(List<String> values) {
        this.values = new ArrayList<>(values);
    }
    
    /**
     * Отримує значення за індексом.
     * 
     * @param index індекс комірки
     * @return значення комірки
     */
    public String getValue(int index) {
        return values.get(index);
    }
    
    /**
     * Повертає всі значення рядка.
     * 
     * @return список значень
     */
    public List<String> getValues() {
        return new ArrayList<>(values);
    }
    
    /**
     * Повертає кількість комірок у рядку.
     * 
     * @return кількість комірок
     */
    public int size() {
        return values.size();
    }
    
    /**
     * Об'єднує поточний рядок з іншим рядком.
     * 
     * @param other інший рядок
     * @return новий рядок з об'єднаними значеннями
     */
    public Row concat(Row other) {
        List<String> combined = new ArrayList<>(this.values);
        combined.addAll(other.values);
        return new Row(combined);
    }
    
    @Override
    public String toString() {
        return values.toString();
    }
}

