package stu.lw.design.factory;

/**
 * @Description product
 * @Author xy
 * @Date 2020/3/23 16:00
 * @Version 1.0
 * @Since JDK 1.8
 */
public class ProductWork implements Work {

    @Override
    public void workDoing() {
        System.out.println("There is product, they are product soul!");
    }
}
