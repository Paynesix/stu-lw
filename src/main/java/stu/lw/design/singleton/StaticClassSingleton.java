package stu.lw.design.singleton;

/**
 * @Description static class singleton
 * @Author xy
 * @Date 2020/3/17 11:08
 * @Version 1.0
 * @Since JDK 1.8
 */
public class StaticClassSingleton {

    private StaticClassSingleton() {}

    public static StaticClassSingleton getInstance() {
        return SingleTonHolder.INSTANCE;
    }

    private static class SingleTonHolder {
        private static StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }
}
