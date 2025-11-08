package com.lab111.labwork5;

/**
 * Простий ітератор для послідовного обходу списку.
 */
public class SimpleIterator implements Iterator {
    private StringList list;
    private int position = 0;
    
    /**
     * Конструктор ітератора.
     * 
     * @param list список для обходу
     */
    public SimpleIterator(StringList list) {
        this.list = list;
    }
    
    @Override
    public boolean hasNext() {
        return position < list.size();
    }
    
    @Override
    public String next() {
        if (hasNext()) {
            return list.get(position++);
        }
        return null;
    }
}





