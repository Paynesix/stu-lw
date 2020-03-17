package stu.lw.design.singleton;

/**
 * @Description hungry singleton
 * @Author xy
 * @Date 2020/3/17 11:07
 * @Version 1.0
 * @Since JDK 1.8
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
