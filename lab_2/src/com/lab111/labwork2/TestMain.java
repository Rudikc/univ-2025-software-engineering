package com.lab111.labwork2;

/**
 * Головний клас для тестування функціональності лабораторної роботи №2.
 * Демонструє роботу всіх інтерфейсів та класів, включаючи відношення
 * генералізації, реалізації та агрегації.
 * 
 * @author Student
 * @version 1.0
 */
public class TestMain {

    /**
     * Точка входу в програму.
     * Створює екземпляри класів та викликає їх методи для демонстрації
     * правильної реалізації UML діаграми.
     * 
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №2: UML та JavaDoc ===\n");

        // Тестування класу Cl1
        System.out.println("--- Тестування Cl1 ---");
        Cl1 cl1 = new Cl1();
        cl1.meth1();
        cl1.meth2();
        System.out.println();

        // Тестування класу Cl3
        System.out.println("--- Тестування Cl3 ---");
        Cl3 cl3 = new Cl3();
        cl3.meth1();
        cl3.meth2();
        cl3.meth3();
        System.out.println();

        // Тестування класу Cl2 (наслідує Cl3)
        System.out.println("--- Тестування Cl2 (наслідує Cl3) ---");
        Cl2 cl2 = new Cl2();
        cl2.meth1(); // викличе Cl3.meth1()
        cl2.meth2(); // власна реалізація Cl2
        System.out.println();

        // Демонстрація агрегації: Cl1 агрегує If1 та If2
        System.out.println("--- Демонстрація агрегації: Cl1 агрегує If1 та If2 ---");
        Cl1 cl1WithAggregation = new Cl1();
        cl1WithAggregation.setIf2Part(cl2); // Cl2 реалізує If2
        cl1WithAggregation.addIf1Part(cl1); // Cl1 реалізує If1
        
        System.out.println("Виклик meth2() з агрегованим If2:");
        cl1WithAggregation.meth2(); // викличе також агрегований If2
        
        System.out.println("Кількість агрегованих If1 частин: " + 
                          cl1WithAggregation.getIf1Parts().size());
        System.out.println();

        // Демонстрація агрегації: Cl3 агрегує Cl2
        System.out.println("--- Демонстрація агрегації: Cl3 агрегує Cl2 ---");
        Cl3 cl3WithAggregation = new Cl3();
        Cl2 aggregatedCl2 = new Cl2();
        cl3WithAggregation.setAggregatedCl2(aggregatedCl2);
        
        System.out.println("Виклик meth2() з агрегованим Cl2:");
        cl3WithAggregation.meth2(); // викличе агрегований Cl2.meth2()
        System.out.println();

        // Демонстрація поліморфізму через інтерфейси
        System.out.println("--- Демонстрація поліморфізму ---");
        If1 if1Ref = cl1;
        If2 if2Ref = cl2;
        If3 if3Ref = cl3;
        
        System.out.println("Виклик через If1 посилання:");
        if1Ref.meth1();
        if1Ref.meth2(); // If1 наслідує If2
        
        System.out.println("\nВиклик через If2 посилання:");
        if2Ref.meth2();
        
        System.out.println("\nВиклик через If3 посилання:");
        if3Ref.meth1(); // If3 наслідує If1, яка наслідує If2
        if3Ref.meth2();
        if3Ref.meth3();
        
        System.out.println("\n=== Тестування завершено ===");
    }
}


