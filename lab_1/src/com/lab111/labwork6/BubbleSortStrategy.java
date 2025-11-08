package com.lab111.labwork6;

import java.util.Comparator;
import java.util.List;

/**
 * Стратегія сортування методом бульбашки.
 * 
 * @param <T> тип елементів для сортування
 */
public class BubbleSortStrategy<T> implements SortStrategy<T> {
    @Override
    public void sort(List<T> data, Comparator<T> comparator) {
        System.out.println("Використовується алгоритм BubbleSort");
        int n = data.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(data.get(j), data.get(j + 1)) > 0) {
                    T temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
    }
}



