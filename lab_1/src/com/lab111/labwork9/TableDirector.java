package com.lab111.labwork9;

/**
 * Директор для керування процесом побудови таблиці.
 * (Director у шаблоні Builder)
 */
public class TableDirector {
    /**
     * Будує прямий добуток двох таблиць використовуючи вказаний будівник.
     * 
     * @param builder будівник таблиці
     * @param table1 перша таблиця
     * @param table2 друга таблиця
     * @return результуюча таблиця
     */
    public Table constructCartesianProduct(TableBuilder builder, Table table1, Table table2) {
        System.out.println("\n=== TableDirector: початок побудови прямого добутку ===");
        
        builder.reset();
        builder.setSourceTables(table1, table2);
        builder.buildColumns();
        builder.buildRows();
        
        System.out.println("=== TableDirector: побудову завершено ===\n");
        return builder.getResult();
    }
}

