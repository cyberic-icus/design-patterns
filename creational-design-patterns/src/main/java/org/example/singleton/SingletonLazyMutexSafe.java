package org.example.singleton;

/**
 * Ленивая реализация синглтона
 * Для создания экземляра используется подход Double Checked Locking
 * <p>
 * Плюсы:
 * Потокобезопасность, высокопроизводительная реализация
 * <p>
 * Минусы:
 * Если рука дрогнет при реализации, то могут быть проблемы.
 */
public class SingletonLazyMutexSafe {
    private static volatile SingletonLazyMutexSafe INSTANCE; // volatile нужен чтобы потоки не использовали указатель на объект синглтона, когда занимаемая им память не была проинициализована

    private SingletonLazyMutexSafe() {
    }

    public static SingletonLazyMutexSafe getInstance() {
        SingletonLazyMutexSafe localSingleton = INSTANCE;
        if (localSingleton == null) {
            synchronized (SingletonLazyMutexSafe.class) {
                localSingleton = INSTANCE;
                if (localSingleton == null) {
                    INSTANCE = localSingleton = new SingletonLazyMutexSafe();
                }
            }
        }
        return localSingleton;
    }
}
