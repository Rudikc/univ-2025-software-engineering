package com.lab111.labwork4;

/**
 * Вікно - уточнена абстракція.
 */
public class Window extends Widget {
    private String title;
    
    /**
     * Конструктор вікна.
     * 
     * @param implementor реалізація UI бібліотеки
     * @param title заголовок вікна
     */
    public Window(UIImplementor implementor, String title) {
        super(implementor);
        this.title = title;
    }
    
    @Override
    public void draw() {
        implementor.drawWindow(title);
    }
}

