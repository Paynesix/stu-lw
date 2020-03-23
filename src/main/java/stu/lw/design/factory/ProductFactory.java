package stu.lw.design.factory;

/**
 * @Description factory
 * @Author xy
 * @Date 2020/3/23 15:44
 * @Version 1.0
 * @Since JDK 1.8
 */
public class ProductFactory extends AbstractFactory {

    public static Product getInstance(String require){
        if(require == null){
            return null;
        }
        Product product;
        if ("pay".equals(require)) {
            product = new PayProduct();
        }else if("bill".equals(require)){
            product = new BillProduct();
        }else {
            product = null;
        }
        return product;
    }

    @Override
    public Product getProductFactory(String require) {
        return this.getInstance(require);
    }

    @Override
    public Work getWorkFactory(String task) {
        return null;
    }
}
