package org.example.singleton;

/**
 * Ленивая реализация синглтона
 * <p>
 * Плюсы:
 * Простота реализации
 * <p>
 * Минусы:
 * Подходит для среды выполнения Java Card
 */
public class SingletonLazyUnsafe {
    private static SingletonLazyUnsafe INSTANCE;

    private SingletonLazyUnsafe() {
    }

    public static SingletonLazyUnsafe getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazyUnsafe();
        }
        return INSTANCE;
    }
}
