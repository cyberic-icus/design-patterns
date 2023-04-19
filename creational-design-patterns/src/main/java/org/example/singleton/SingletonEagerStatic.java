package org.example.singleton;

/**
 * Eager реализация синглтона
 * Создание экземпляра происходит в статическом блоке.
 * <p>
 * Плюсы:
 * Потокобезопасность, простая реализация, возможность обернуть в try/catch
 */
public class SingletonEagerStatic {

    private final static SingletonEagerStatic INSTANCE;

    static {
        INSTANCE = new SingletonEagerStatic();
    }

    private SingletonEagerStatic() {
    }

    public static SingletonEagerStatic getInstance() {
        return INSTANCE;
    }
}
