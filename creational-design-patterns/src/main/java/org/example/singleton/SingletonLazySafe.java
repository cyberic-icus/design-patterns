package org.example.singleton;

/**
 * Ленивая реализация синглтона
 * СОздание происходит через синхронизированный метод
 * <p>
 * Плюсы:
 * Потокобезопасность, простота реализации
 * <p>
 * Минусы:
 * Низкая производительность из-за синхронизизрованного метода
 */
public class SingletonLazySafe {
    public static SingletonLazySafe INSTANCE;

    private SingletonLazySafe() {
    }

    public static synchronized SingletonLazySafe getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazySafe();
        }
        return INSTANCE;
    }
}
