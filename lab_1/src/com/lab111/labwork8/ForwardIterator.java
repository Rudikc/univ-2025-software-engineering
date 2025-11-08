package com.lab111.labwork8;

/**
 * Конкретний ітератор для прямого обходу списку (від початку до кінця).
 * 
 * @param <T> тип елементів
 */
public class ForwardIterator<T> implements Iterator<T> {
    private LinearList<T> list;
    private int currentIndex;
    
    /**
     * Конструктор прямого ітератора.
     * 
     * @param list список для обходу
     */
    public ForwardIterator(LinearList<T> list) {
        this.list = list;
        this.currentIndex = 0;
        System.out.println("Ініціалізовано ForwardIterator");
    }
    
    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }
    
    @Override
    public T next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("Немає наступного елемента");
        }
        T item = list.get(currentIndex);
        currentIndex++;
        return item;
    }
    
    @Override
    public void reset() {
        currentIndex = 0;
        System.out.println("ForwardIterator скинуто на початок");
    }
}

