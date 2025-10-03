package com.lab111.labwork2;

/**
 * Клас Cl2 успадковується від Cl3 та реалізує If2.
 */
public class Cl2 extends Cl3 implements If2 {

    /**
     * Конструктор за замовчуванням.
     */
    public Cl2() {
        super();
    }

    @Override
    public void meth1() {
        super.meth1();
    }

    @Override
    public void meth2() {
        System.out.println("Cl2.meth2() invoked");
    }
}

