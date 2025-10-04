package com.lab111.labwork4;

/**
 * Тестування шаблону Bridge для GUI елементів.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №4: Шаблон Bridge ===\n");
        
        // Створення реалізацій
        UIImplementor qtImpl = new QtImplementor();
        UIImplementor gtkImpl = new GtkImplementor();
        
        System.out.println("--- Тест 1: Кнопка з Qt ---");
        Widget qtButton = new Button(qtImpl, "OK");
        qtButton.draw();
        
        System.out.println("\n--- Тест 2: Вікно з Qt ---");
        Widget qtWindow = new Window(qtImpl, "Головне вікно");
        qtWindow.draw();
        
        System.out.println("\n--- Тест 3: Кнопка з GTK ---");
        Widget gtkButton = new Button(gtkImpl, "Скасувати");
        gtkButton.draw();
        
        System.out.println("\n--- Тест 4: Вікно з GTK ---");
        Widget gtkWindow = new Window(gtkImpl, "Діалог");
        gtkWindow.draw();
        
        System.out.println("\n--- Тест 5: Зміна реалізації на льоту ---");
        Button dynamicButton = new Button(qtImpl, "Зберегти");
        System.out.println("Спочатку з Qt:");
        dynamicButton.draw();
        
        System.out.println("\n=== Тестування завершено ===");
    }
}

