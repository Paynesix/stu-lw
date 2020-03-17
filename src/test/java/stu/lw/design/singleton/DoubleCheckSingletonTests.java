package stu.lw.design.singleton;

/**
 * @Description Double Check Singleton
 * @Author xy
 * @Date 2020/3/17 11:02
 * @Version 1.0
 * @Since JDK 1.8
 */
public class DoubleCheckSingletonTests {

    public static void main(String[] args) {
        DoubleCheckSingleton singleton = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton singleton1 = DoubleCheckSingleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
