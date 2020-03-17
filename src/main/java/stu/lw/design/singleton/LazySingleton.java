package stu.lw.design.singleton;

/**
 * @Description 懒汉式单列
 * @Author xy
 * @Date 2020/3/17 10:56
 * @Version 1.0
 * @Since JDK 1.8
 */
public class LazySingleton {

    private static LazySingleton singleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
