package com.lab111.labwork4;

/**
 * Реалізація UI через бібліотеку Qt.
 */
public class QtImplementor implements UIImplementor {
    @Override
    public void drawButton(String label) {
        System.out.println("[Qt] Малювання кнопки: '" + label + "'");
    }
    
    @Override
    public void drawWindow(String title) {
        System.out.println("[Qt] Малювання вікна: '" + title + "'");
    }
}

