package stu.lw.design.factory;

/**
 * @Description product
 * @Author xy
 * @Date 2020/3/23 15:42
 * @Version 1.0
 * @Since JDK 1.8
 */
public class PayProduct implements Product {

    @Override
    public boolean requireComplete() {
        System.out.println("Pay is Complete?");
        return true;
    }
}
