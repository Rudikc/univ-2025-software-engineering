package com.lab111.labwork5;

/**
 * Ітератор з фільтрацією елементів.
 */
public class FilteredIterator implements Iterator {
    private StringList list;
    private int position = 0;
    private Integer minLength = null;
    private Character firstChar = null;
    
    /**
     * Конструктор для фільтрації по довжині.
     * 
     * @param list список для обходу
     * @param minLength мінімальна довжина рядка
     */
    public FilteredIterator(StringList list, int minLength) {
        this.list = list;
        this.minLength = minLength;
    }
    
    /**
     * Конструктор для фільтрації по першій літері.
     * 
     * @param list список для обходу
     * @param firstChar перша літера для фільтрації
     */
    public FilteredIterator(StringList list, char firstChar) {
        this.list = list;
        this.firstChar = firstChar;
    }
    
    @Override
    public boolean hasNext() {
        while (position < list.size()) {
            String item = list.get(position);
            if (matches(item)) {
                return true;
            }
            position++;
        }
        return false;
    }
    
    @Override
    public String next() {
        if (hasNext()) {
            return list.get(position++);
        }
        return null;
    }
    
    /**
     * Перевіряє чи відповідає елемент фільтру.
     * 
     * @param item рядок для перевірки
     * @return true якщо елемент відповідає фільтру
     */
    private boolean matches(String item) {
        if (minLength != null) {
            return item.length() >= minLength;
        }
        if (firstChar != null) {
            return !item.isEmpty() && item.charAt(0) == firstChar;
        }
        return true;
    }
}





