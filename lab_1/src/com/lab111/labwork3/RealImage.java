package com.lab111.labwork3;

/**
 * Реальний об'єкт зображення.
 * Представляє справжнє зображення з можливістю доступу до кольорів пікселів.
 */
public class RealImage implements Image {
    private String filename;
    
    /**
     * Конструктор реального зображення.
     * 
     * @param filename назва файлу зображення
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    
    /**
     * Завантаження зображення з диску (заглушка).
     */
    private void loadFromDisk() {
        System.out.println("Завантаження зображення з диску: " + filename);
    }
    
    @Override
    public String getColor(int x, int y) {
        System.out.println("RealImage.getColor(x=" + x + ", y=" + y + ")");
        // Заглушка - повертаємо умовний колір
        return "RGB(" + (x % 256) + ", " + (y % 256) + ", " + ((x + y) % 256) + ")";
    }
}

