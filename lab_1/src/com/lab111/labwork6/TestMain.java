package com.lab111.labwork6;

import java.util.Comparator;

/**
 * Тестування шаблону Strategy для сортування контейнерів.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №6: Шаблон Strategy ===\n");
        
        // Тест 1: Контейнер цілих чисел з BubbleSort
        System.out.println("--- Тест 1: Контейнер цілих чисел ---");
        Container<Integer> intContainer = new Container<>();
        intContainer.add(5);
        intContainer.add(2);
        intContainer.add(8);
        intContainer.add(1);
        intContainer.add(9);
        
        System.out.println("Початкові дані:");
        intContainer.print();
        
        intContainer.setStrategy(new BubbleSortStrategy<>());
        intContainer.sort(Comparator.naturalOrder());
        System.out.println("Після сортування (зростання):");
        intContainer.print();
        
        // Тест 2: Зміна стратегії на QuickSort і сортування по спаданню
        System.out.println("\n--- Тест 2: Зміна стратегії та напрямку ---");
        intContainer.setStrategy(new QuickSortStrategy<>());
        intContainer.sort(Comparator.reverseOrder());
        System.out.println("Після сортування (спадання):");
        intContainer.print();
        
        // Тест 3: Контейнер рядків з QuickSort
        System.out.println("\n--- Тест 3: Контейнер рядків ---");
        Container<String> stringContainer = new Container<>();
        stringContainer.add("Banana");
        stringContainer.add("Apple");
        stringContainer.add("Cherry");
        stringContainer.add("Date");
        
        System.out.println("Початкові дані:");
        stringContainer.print();
        
        stringContainer.setStrategy(new QuickSortStrategy<>());
        stringContainer.sort(Comparator.naturalOrder());
        System.out.println("Після сортування (алфавітний порядок):");
        stringContainer.print();
        
        // Тест 4: Сортування рядків по довжині
        System.out.println("\n--- Тест 4: Сортування рядків по довжині ---");
        stringContainer.setStrategy(new BubbleSortStrategy<>());
        stringContainer.sort(Comparator.comparingInt(String::length));
        System.out.println("Після сортування по довжині:");
        stringContainer.print();
        
        System.out.println("\n=== Тестування завершено ===");
    }
}

