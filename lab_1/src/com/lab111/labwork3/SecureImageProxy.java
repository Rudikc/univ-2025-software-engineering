package com.lab111.labwork3;

/**
 * Proxy для контролю доступу до зображення.
 * Дозволяє доступ тільки до пікселів в межах заданих координат.
 */
public class SecureImageProxy implements Image {
    private RealImage realImage;
    private int x1, x2, y1, y2;
    
    /**
     * Конструктор проксі з обмеженнями доступу.
     * 
     * @param filename назва файлу зображення
     * @param x1 мінімальна координата x
     * @param x2 максимальна координата x
     * @param y1 мінімальна координата y
     * @param y2 максимальна координата y
     */
    public SecureImageProxy(String filename, int x1, int x2, int y1, int y2) {
        this.realImage = new RealImage(filename);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        System.out.println("Створено SecureImageProxy з обмеженнями: x[" + x1 + ".." + x2 + "], y[" + y1 + ".." + y2 + "]");
    }
    
    @Override
    public String getColor(int x, int y) {
        if (checkAccess(x, y)) {
            System.out.println("Доступ дозволено для координат (" + x + ", " + y + ")");
            return realImage.getColor(x, y);
        } else {
            System.out.println("Доступ заборонено для координат (" + x + ", " + y + ")");
            return "ACCESS_DENIED";
        }
    }
    
    /**
     * Перевірка доступу до координат.
     * 
     * @param x координата x
     * @param y координата y
     * @return true якщо доступ дозволено
     */
    private boolean checkAccess(int x, int y) {
        return (x > x1 && x < x2 && y > y1 && y < y2);
    }
}

