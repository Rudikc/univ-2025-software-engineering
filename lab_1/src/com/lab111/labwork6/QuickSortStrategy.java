package com.lab111.labwork6;

import java.util.Comparator;
import java.util.List;

/**
 * Стратегія швидкого сортування.
 * 
 * @param <T> тип елементів для сортування
 */
public class QuickSortStrategy<T> implements SortStrategy<T> {
    @Override
    public void sort(List<T> data, Comparator<T> comparator) {
        System.out.println("Використовується алгоритм QuickSort");
        if (data.size() > 1) {
            quickSort(data, 0, data.size() - 1, comparator);
        }
    }
    
    private void quickSort(List<T> data, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int pi = partition(data, low, high, comparator);
            quickSort(data, low, pi - 1, comparator);
            quickSort(data, pi + 1, high, comparator);
        }
    }
    
    private int partition(List<T> data, int low, int high, Comparator<T> comparator) {
        T pivot = data.get(high);
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (comparator.compare(data.get(j), pivot) <= 0) {
                i++;
                T temp = data.get(i);
                data.set(i, data.get(j));
                data.set(j, temp);
            }
        }
        
        T temp = data.get(i + 1);
        data.set(i + 1, data.get(high));
        data.set(high, temp);
        
        return i + 1;
    }
}

