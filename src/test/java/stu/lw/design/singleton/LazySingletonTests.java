package stu.lw.design.singleton;

/**
 * @Description 懒汉式单列
 * @Author xy
 * @Date 2020/3/17 10:59
 * @Version 1.0
 * @Since JDK 1.8
 */
public class LazySingletonTests {

    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton singleton1 = LazySingleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
