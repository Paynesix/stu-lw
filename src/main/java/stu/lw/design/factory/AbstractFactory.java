package stu.lw.design.factory;

/**
 * @Description AbstractFactory
 * @Author xy
 * @Date 2020/3/23 16:04
 * @Version 1.0
 * @Since JDK 1.8
 */
public abstract class AbstractFactory {
    public abstract Product getProductFactory(String require);
    public abstract Work getWorkFactory(String task);
}
