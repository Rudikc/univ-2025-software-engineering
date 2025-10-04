package com.lab111.labwork4;

/**
 * Реалізація UI через бібліотеку GTK.
 */
public class GtkImplementor implements UIImplementor {
    @Override
    public void drawButton(String label) {
        System.out.println("[GTK] Малювання кнопки: '" + label + "'");
    }
    
    @Override
    public void drawWindow(String title) {
        System.out.println("[GTK] Малювання вікна: '" + title + "'");
    }
}

