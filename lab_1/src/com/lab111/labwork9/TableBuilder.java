package com.lab111.labwork9;

/**
 * Інтерфейс будівника таблиць (Builder у шаблоні Builder).
 */
public interface TableBuilder {
    /**
     * Ініціалізує побудову нової таблиці.
     */
    void reset();
    
    /**
     * Встановлює вихідні таблиці для операції.
     * 
     * @param table1 перша таблиця
     * @param table2 друга таблиця
     */
    void setSourceTables(Table table1, Table table2);
    
    /**
     * Будує структуру колонок результуючої таблиці.
     */
    void buildColumns();
    
    /**
     * Будує рядки результуючої таблиці.
     */
    void buildRows();
    
    /**
     * Повертає побудовану таблицю.
     * 
     * @return результуюча таблиця
     */
    Table getResult();
}

