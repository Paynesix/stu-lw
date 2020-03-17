package stu.lw.design.singleton;

/**
 * @Description 懒汉式单列
 * @Author xy
 * @Date 2020/3/17 10:59
 * @Version 1.0
 * @Since JDK 1.8
 */
public class HungrySingletonTests {

    public static void main(String[] args) {
        HungrySingleton singleton = HungrySingleton.getInstance();
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
