package stu.lw.design.singleton;

/**
 * @Description 双重检查
 * @Author xy
 * @Date 2020/3/17 11:00
 * @Version 1.0
 * @Since JDK 1.8
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                    return singleton;
                }
            }
        }
        return singleton;
    }
}
