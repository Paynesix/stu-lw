package stu.lw.design.singleton;

/**
 * @Description static class singleton
 * @Author xy
 * @Date 2020/3/17 11:08
 * @Version 1.0
 * @Since JDK 1.8
 */
public class StaticClassSingletonTests {

    public static void main(String[] args) {
        StaticClassSingleton singleton = StaticClassSingleton.getInstance();
        StaticClassSingleton singleton1 = StaticClassSingleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
