package com.lab111.labwork4;

/**
 * Кнопка - уточнена абстракція.
 */
public class Button extends Widget {
    private String label;
    
    /**
     * Конструктор кнопки.
     * 
     * @param implementor реалізація UI бібліотеки
     * @param label текст на кнопці
     */
    public Button(UIImplementor implementor, String label) {
        super(implementor);
        this.label = label;
    }
    
    @Override
    public void draw() {
        implementor.drawButton(label);
    }
}

