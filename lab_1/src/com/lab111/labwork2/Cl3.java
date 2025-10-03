package com.lab111.labwork2;

/**
 * Базовий клас Cl3 реалізує If3 та агрегує Cl2.
 */
public class Cl3 implements If3 {

    private Cl2 aggregatedCl2;

    /**
     * Конструктор за замовчуванням.
     */
    public Cl3() {
    }

    /**
     * Встановлює агрегований об'єкт Cl2.
     * 
     * @param aggregatedCl2 об'єкт класу Cl2 для агрегації
     */
    public void setAggregatedCl2(Cl2 aggregatedCl2) {
        this.aggregatedCl2 = aggregatedCl2;
    }

    /**
     * Повертає поточний агрегований об'єкт Cl2.
     * 
     * @return поточний агрегований об'єкт Cl2 або null
     */
    public Cl2 getAggregatedCl2() {
        return aggregatedCl2;
    }

    @Override
    public void meth1() {
        System.out.println("Cl3.meth1() invoked");
    }

    @Override
    public void meth2() {
        if (aggregatedCl2 != null) {
            aggregatedCl2.meth2();
        }
    }

    @Override
    public void meth3() {
        System.out.println("Cl3.meth3() invoked");
    }
}

