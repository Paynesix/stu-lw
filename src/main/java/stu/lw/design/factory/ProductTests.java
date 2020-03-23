package stu.lw.design.factory;

/**
 * @Description product tests
 * @Author xy
 * @Date 2020/3/23 15:47
 * @Version 1.0
 * @Since JDK 1.8
 */
public class ProductTests {

    public static void main(String[] args){
        Product product = ProductFactory.getInstance("pay");
        System.out.println(product.requireComplete());
    }
}
