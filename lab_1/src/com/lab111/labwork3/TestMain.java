package com.lab111.labwork3;

/**
 * Тестування шаблону Proxy для контролю доступу до зображень.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №3: Шаблон Proxy ===\n");
        
        // Створення проксі з обмеженнями доступу x: 10..100, y: 20..80
        Image secureImage = new SecureImageProxy("photo.jpg", 10, 100, 20, 80);
        
        System.out.println("\n--- Тест 1: Доступ в межах дозволеної області ---");
        String color1 = secureImage.getColor(50, 50); // Дозволено
        System.out.println("Результат: " + color1);
        
        System.out.println("\n--- Тест 2: Доступ поза дозволеною областю (x < x1) ---");
        String color2 = secureImage.getColor(5, 50); // Заборонено
        System.out.println("Результат: " + color2);
        
        System.out.println("\n--- Тест 3: Доступ поза дозволеною областю (y > y2) ---");
        String color3 = secureImage.getColor(50, 90); // Заборонено
        System.out.println("Результат: " + color3);
        
        System.out.println("\n--- Тест 4: Граничний випадок (на межі) ---");
        String color4 = secureImage.getColor(10, 80); // Заборонено (рівність не входить)
        System.out.println("Результат: " + color4);
        
        System.out.println("\n--- Тест 5: Ще один доступ в межах ---");
        String color5 = secureImage.getColor(99, 79); // Дозволено
        System.out.println("Результат: " + color5);
        
        System.out.println("\n=== Тестування завершено ===");
    }
}

