package org.example.singleton;

/**
 * Ленивая реализация синглтона
 * Создание экземпляра делегируется статическому полю внутреннего "статического" класса
 * <p>
 * Плюсы:
 * Потокобезопасность, простая и высокопроизводительная реализация
 * <p>
 * Минусы:
 * Невозможно использовать для не статических полей класса
 */
public class SingletonInnerClass {
    private SingletonInnerClass() {
    }

    public static SingletonInnerClass getInstance() {
        return SingletonInitializer.INSTANCE;
    }

    private static class SingletonInitializer {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }
}
