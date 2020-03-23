package stu.lw.design.factory;

/**
 * @Description abstract factory tests
 * @Author xy
 * @Date 2020/3/23 16:22
 * @Version 1.0
 * @Since JDK 1.8
 */
public class AbstractFactoryTests {

    public static void main(String[] args) {
        ProductFactory productFactory = (ProductFactory) ProductWorkFactory.getFactory("product");
        Product product = productFactory.getProductFactory("pay");
        product.requireComplete();
    }
}
