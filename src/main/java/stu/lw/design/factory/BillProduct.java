package stu.lw.design.factory;

/**
 * @Description product
 * @Author xy
 * @Date 2020/3/23 15:43
 * @Version 1.0
 * @Since JDK 1.8
 */
public class BillProduct implements Product {

    @Override
    public boolean requireComplete() {
        System.out.println("Bill is Complete? ====, I see it not come on!");
        return false;
    }
}
