package com.lab111.labwork9;

import java.util.ArrayList;
import java.util.List;

/**
 * Конкретний будівник для створення прямого добутку (декартового добутку) таблиць.
 * (ConcreteBuilder у шаблоні Builder)
 */
public class CartesianProductBuilder implements TableBuilder {
    private Table result;
    private Table sourceTable1;
    private Table sourceTable2;
    
    /**
     * Конструктор будівника.
     */
    public CartesianProductBuilder() {
        System.out.println("CartesianProductBuilder: створено");
    }
    
    @Override
    public void reset() {
        this.result = null;
        this.sourceTable1 = null;
        this.sourceTable2 = null;
        System.out.println("CartesianProductBuilder: скинуто стан");
    }
    
    @Override
    public void setSourceTables(Table table1, Table table2) {
        this.sourceTable1 = table1;
        this.sourceTable2 = table2;
        System.out.println("CartesianProductBuilder: встановлено вихідні таблиці");
        System.out.println("  Таблиця 1: " + table1.getRowCount() + " рядків, " + 
                          table1.getColumnCount() + " колонок");
        System.out.println("  Таблиця 2: " + table2.getRowCount() + " рядків, " + 
                          table2.getColumnCount() + " колонок");
    }
    
    @Override
    public void buildColumns() {
        if (sourceTable1 == null || sourceTable2 == null) {
            System.out.println("ПОМИЛКА: вихідні таблиці не встановлено");
            return;
        }
        
        System.out.println("CartesianProductBuilder: побудова колонок...");
        List<String> columns = new ArrayList<>();
        
        // Додаємо колонки з першої таблиці
        for (String col : sourceTable1.getColumns()) {
            columns.add("T1." + col);
        }
        
        // Додаємо колонки з другої таблиці
        for (String col : sourceTable2.getColumns()) {
            columns.add("T2." + col);
        }
        
        result = new Table(columns);
        System.out.println("  Створено " + columns.size() + " колонок");
    }
    
    @Override
    public void buildRows() {
        if (result == null) {
            System.out.println("ПОМИЛКА: спочатку потрібно побудувати колонки");
            return;
        }
        
        System.out.println("CartesianProductBuilder: побудова рядків (декартовий добуток)...");
        int count = 0;
        
        // Створюємо всі можливі комбінації рядків з обох таблиць
        for (Row row1 : sourceTable1.getRows()) {
            for (Row row2 : sourceTable2.getRows()) {
                Row combinedRow = row1.concat(row2);
                result.addRow(combinedRow);
                count++;
            }
        }
        
        System.out.println("  Створено " + count + " рядків");
    }
    
    @Override
    public Table getResult() {
        System.out.println("CartesianProductBuilder: повертаємо результат");
        return result;
    }
}

