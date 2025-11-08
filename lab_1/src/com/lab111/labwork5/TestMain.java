package com.lab111.labwork5;

/**
 * Тестування шаблону Iterator з фільтрацією.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №5: Шаблон Iterator ===\n");
        
        // Створення списку рядків
        StringList list = new StringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cat");
        list.add("Dog");
        list.add("Elephant");
        list.add("Fox");
        list.add("Ant");
        
        // Тест 1: Простий обхід
        System.out.println("\n--- Тест 1: Простий послідовний обхід ---");
        Iterator simpleIterator = list.createIterator();
        while (simpleIterator.hasNext()) {
            System.out.println("Елемент: " + simpleIterator.next());
        }
        
        // Тест 2: Фільтрація по довжині (>= 5 символів)
        System.out.println("\n--- Тест 2: Обхід з фільтрацією (довжина >= 5) ---");
        Iterator lengthIterator = list.createFilteredIteratorByLength(5);
        while (lengthIterator.hasNext()) {
            System.out.println("Елемент: " + lengthIterator.next());
        }
        
        // Тест 3: Фільтрація по першій літері 'A'
        System.out.println("\n--- Тест 3: Обхід з фільтрацією (перша літера 'A') ---");
        Iterator charIterator = list.createFilteredIteratorByChar('A');
        while (charIterator.hasNext()) {
            System.out.println("Елемент: " + charIterator.next());
        }
        
        // Тест 4: Фільтрація по довжині (>= 3 символи)
        System.out.println("\n--- Тест 4: Обхід з фільтрацією (довжина >= 3) ---");
        Iterator length3Iterator = list.createFilteredIteratorByLength(3);
        while (length3Iterator.hasNext()) {
            System.out.println("Елемент: " + length3Iterator.next());
        }
        
        System.out.println("\n=== Тестування завершено ===");
    }
}





