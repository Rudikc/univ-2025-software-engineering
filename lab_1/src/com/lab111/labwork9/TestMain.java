package com.lab111.labwork9;

/**
 * Тестування шаблону Builder для побудови прямого добутку таблиць.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №9: Шаблон Builder ===\n");
        
        // Тест 1: Створення перших вихідних таблиць
        System.out.println("--- Тест 1: Створення вихідних таблиць ---");
        
        Table students = new Table("ID", "Name");
        students.addRow(new Row("1", "Іван"));
        students.addRow(new Row("2", "Марія"));
        students.addRow(new Row("3", "Петро"));
        
        System.out.println("\nТаблиця Students:");
        students.display();
        
        Table courses = new Table("CourseID", "CourseName");
        courses.addRow(new Row("A", "Математика"));
        courses.addRow(new Row("B", "Фізика"));
        
        System.out.println("\nТаблиця Courses:");
        courses.display();
        
        // Тест 2: Побудова прямого добутку через Director
        System.out.println("\n--- Тест 2: Побудова прямого добутку через Director ---");
        
        TableDirector director = new TableDirector();
        TableBuilder builder = new CartesianProductBuilder();
        
        Table cartesianProduct = director.constructCartesianProduct(builder, students, courses);
        
        System.out.println("Результат (Students × Courses):");
        cartesianProduct.display();
        
        // Тест 3: Прямий добуток менших таблиць
        System.out.println("\n--- Тест 3: Прямий добуток менших таблиць ---");
        
        Table colors = new Table("Color");
        colors.addRow(new Row("Червоний"));
        colors.addRow(new Row("Синій"));
        
        Table sizes = new Table("Size");
        sizes.addRow(new Row("S"));
        sizes.addRow(new Row("M"));
        sizes.addRow(new Row("L"));
        
        System.out.println("\nТаблиця Colors:");
        colors.display();
        
        System.out.println("\nТаблиця Sizes:");
        sizes.display();
        
        Table productVariants = director.constructCartesianProduct(builder, colors, sizes);
        
        System.out.println("Результат (Colors × Sizes):");
        productVariants.display();
        
        // Тест 4: Побудова без Director (ручне керування)
        System.out.println("\n--- Тест 4: Ручна побудова без Director ---");
        
        CartesianProductBuilder manualBuilder = new CartesianProductBuilder();
        manualBuilder.reset();
        manualBuilder.setSourceTables(students, colors);
        manualBuilder.buildColumns();
        manualBuilder.buildRows();
        
        Table manualResult = manualBuilder.getResult();
        System.out.println("\nРезультат ручної побудови (Students × Colors):");
        manualResult.display();
        
        System.out.println("\n=== Тестування завершено ===");
    }
}

