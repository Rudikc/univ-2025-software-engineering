package com.lab111.labwork8;

/**
 * Тестування шаблону Factory Method для створення ітераторів.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №8: Шаблон Factory Method ===\n");
        
        // Створення списку цілих чисел
        System.out.println("--- Тест 1: Створення списку цілих чисел ---");
        LinearList<Integer> intList = new LinearList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
        
        // Прямий обхід
        System.out.println("\n--- Тест 2: Прямий обхід (Forward) ---");
        Iterator<Integer> forwardIterator = intList.createIterator(IteratorType.FORWARD);
        System.out.print("Елементи в прямому порядку: ");
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + " ");
        }
        System.out.println();
        
        // Зворотний обхід
        System.out.println("\n--- Тест 3: Зворотний обхід (Reverse) ---");
        Iterator<Integer> reverseIterator = intList.createIterator(IteratorType.REVERSE);
        System.out.print("Елементи в зворотному порядку: ");
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }
        System.out.println();
        
        // Тест скидання ітератора
        System.out.println("\n--- Тест 4: Скидання ітератора ---");
        forwardIterator.reset();
        System.out.print("Повторний прямий обхід: ");
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + " ");
        }
        System.out.println();
        
        // Список рядків
        System.out.println("\n--- Тест 5: Список рядків ---");
        LinearList<String> stringList = new LinearList<>();
        stringList.add("Alpha");
        stringList.add("Beta");
        stringList.add("Gamma");
        stringList.add("Delta");
        
        System.out.println("\nПрямий обхід рядків:");
        Iterator<String> strForward = stringList.createIterator(IteratorType.FORWARD);
        while (strForward.hasNext()) {
            System.out.println("  - " + strForward.next());
        }
        
        System.out.println("\nЗворотний обхід рядків:");
        Iterator<String> strReverse = stringList.createIterator(IteratorType.REVERSE);
        while (strReverse.hasNext()) {
            System.out.println("  - " + strReverse.next());
        }
        
        // Множинні ітератори одночасно
        System.out.println("\n--- Тест 6: Множинні ітератори ---");
        Iterator<Integer> iter1 = intList.createIterator(IteratorType.FORWARD);
        Iterator<Integer> iter2 = intList.createIterator(IteratorType.REVERSE);
        
        System.out.println("Перші елементи:");
        System.out.println("  Forward: " + iter1.next());
        System.out.println("  Reverse: " + iter2.next());
        
        System.out.println("\n=== Тестування завершено ===");
    }
}

