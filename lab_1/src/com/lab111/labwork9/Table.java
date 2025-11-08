package com.lab111.labwork9;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас для представлення реляційної таблиці (Product у шаблоні Builder).
 */
public class Table {
    private List<String> columns;
    private List<Row> rows;
    
    /**
     * Конструктор таблиці з переліком колонок.
     * 
     * @param columns назви колонок
     */
    public Table(String... columns) {
        this.columns = new ArrayList<>();
        for (String col : columns) {
            this.columns.add(col);
        }
        this.rows = new ArrayList<>();
    }
    
    /**
     * Конструктор таблиці зі списком колонок.
     * 
     * @param columns список назв колонок
     */
    public Table(List<String> columns) {
        this.columns = new ArrayList<>(columns);
        this.rows = new ArrayList<>();
    }
    
    /**
     * Додає рядок до таблиці.
     * 
     * @param row рядок для додавання
     */
    public void addRow(Row row) {
        if (row.size() != columns.size()) {
            System.out.println("Попередження: кількість значень не відповідає кількості колонок");
        }
        rows.add(row);
    }
    
    /**
     * Повертає всі рядки таблиці.
     * 
     * @return список рядків
     */
    public List<Row> getRows() {
        return new ArrayList<>(rows);
    }
    
    /**
     * Повертає назви колонок.
     * 
     * @return список назв колонок
     */
    public List<String> getColumns() {
        return new ArrayList<>(columns);
    }
    
    /**
     * Повертає кількість рядків у таблиці.
     * 
     * @return кількість рядків
     */
    public int getRowCount() {
        return rows.size();
    }
    
    /**
     * Повертає кількість колонок у таблиці.
     * 
     * @return кількість колонок
     */
    public int getColumnCount() {
        return columns.size();
    }
    
    /**
     * Виводить таблицю на консоль.
     */
    public void display() {
        System.out.println("Таблиця (" + rows.size() + " рядків, " + columns.size() + " колонок):");
        System.out.println("Колонки: " + columns);
        for (int i = 0; i < rows.size(); i++) {
            System.out.println("  Рядок " + (i + 1) + ": " + rows.get(i));
        }
    }
}

