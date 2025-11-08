package com.lab111.labwork8;

/**
 * Конкретний ітератор для зворотного обходу списку (від кінця до початку).
 * 
 * @param <T> тип елементів
 */
public class ReverseIterator<T> implements Iterator<T> {
    private LinearList<T> list;
    private int currentIndex;
    
    /**
     * Конструктор зворотного ітератора.
     * 
     * @param list список для обходу
     */
    public ReverseIterator(LinearList<T> list) {
        this.list = list;
        this.currentIndex = list.size() - 1;
        System.out.println("Ініціалізовано ReverseIterator");
    }
    
    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }
    
    @Override
    public T next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("Немає наступного елемента");
        }
        T item = list.get(currentIndex);
        currentIndex--;
        return item;
    }
    
    @Override
    public void reset() {
        currentIndex = list.size() - 1;
        System.out.println("ReverseIterator скинуто на кінець");
    }
}

