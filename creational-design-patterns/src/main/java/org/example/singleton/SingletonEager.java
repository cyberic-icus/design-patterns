package org.example.singleton;

/**
 * Eager реализация синглтона
 * Создание экземпляра происходит через вызов конструктора в статическом поле
 * <p>
 * Плюсы:
 * Потокобезопасность, простая реализация
 */
public class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
