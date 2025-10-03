package com.lab111.labwork2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Клас Cl1 реалізує If1 та агрегує посилання на If1 і If2.
 */
public class Cl1 implements If1 {

    private final List<If1> if1Parts = new ArrayList<>();
    private If2 if2Part;

    /**
     * Створює Cl1 з внесенням самого себе до колекції If1.
     */
    public Cl1() {
        if1Parts.add(this);
    }

    /**
     * Додає додаткову реалізацію If1 до агрегованого списку.
     * 
     * @param part реалізація інтерфейсу If1 для додавання до колекції
     */
    public void addIf1Part(If1 part) {
        if (part != null && !if1Parts.contains(part)) {
            if1Parts.add(part);
        }
    }

    /**
     * Повертає немодифікований список агрегованих If1.
     * 
     * @return немодифікований список усіх агрегованих реалізацій If1
     */
    public List<If1> getIf1Parts() {
        return Collections.unmodifiableList(if1Parts);
    }

    /**
     * Встановлює агреговану реалізацію If2.
     * 
     * @param if2Part реалізація інтерфейсу If2 для агрегації
     */
    public void setIf2Part(If2 if2Part) {
        this.if2Part = if2Part;
    }

    /**
     * Повертає поточну агреговану реалізацію If2.
     * 
     * @return поточна агрегована реалізація If2 або null
     */
    public If2 getIf2Part() {
        return if2Part;
    }

    @Override
    public void meth1() {
        System.out.println("Cl1.meth1() invoked");
    }

    @Override
    public void meth2() {
        System.out.println("Cl1.meth2() invoked");
        if (if2Part != null) {
            if2Part.meth2();
        }
    }
}
