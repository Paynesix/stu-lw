package stu.lw.design.factory;

/**
 * @Description product tests
 * @Author xy
 * @Date 2020/3/23 15:47
 * @Version 1.0
 * @Since JDK 1.8
 */
public class ProductWorkFactory {

    public static AbstractFactory getFactory(String choice){
        if(choice == null){
            return null;
        }
        if("product".equals(choice)){
            return new ProductFactory();
        }else if("work".equals(choice)){
            return new WorkFactory();
        }
        return null;
    }
}
