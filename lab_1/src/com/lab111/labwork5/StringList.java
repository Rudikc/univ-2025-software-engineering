package com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;

/**
 * Конкретний агрегат - список рядків.
 */
public class StringList implements Aggregate {
    private List<String> items = new ArrayList<>();
    
    /**
     * Додає рядок до списку.
     * 
     * @param item рядок для додавання
     */
    public void add(String item) {
        items.add(item);
        System.out.println("Додано рядок: '" + item + "'");
    }
    
    /**
     * Повертає елемент за індексом.
     * 
     * @param index індекс елемента
     * @return рядок за вказаним індексом
     */
    public String get(int index) {
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
    
    @Override
    public Iterator createIterator() {
        return new SimpleIterator(this);
    }
    
    @Override
    public Iterator createFilteredIteratorByLength(int minLength) {
        return new FilteredIterator(this, minLength);
    }
    
    @Override
    public Iterator createFilteredIteratorByChar(char firstChar) {
        return new FilteredIterator(this, firstChar);
    }
}





