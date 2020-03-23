### 工厂模式

- 场景

1. 支付中选择不同的支付方式
2. Hibernate数据库连接，只需要修改方言和数据库驱动就好

- 优点

1. 新建对象，不需要知道内部中具体细节

- 缺点

1. 增加产品，需要修改工厂类，破坏了开闭原则

- 类图



- 示例

1. 产品接口定义，是否完成需求

```java
public interface Product {
    // require is complete ? yes or no
    boolean requireComplete();
}
```

2. 产品具体实现，对账任务

```java
public class BillProduct implements Product {

    @Override
    public boolean requireComplete() {
        System.out.println("Bill is Complete? ====, I see it not come on!");
        return false;
    }
}
```

3. 产品具体实现，支付任务

```java
public class PayProduct implements Product {

    @Override
    public boolean requireComplete() {
        System.out.println("Pay is Complete?");
        return true;
    }
}
```

4. 抽象工厂类，根据具体输入，返回具体实现类

```java
public class ProductFactory {

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
}
```

5. 测试

```java
public class ProductTests {

    public static void main(String[] args){
        Product product = ProductFactory.getInstance("pay");
        System.out.println(product.requireComplete());
    }
}

//================output
//Pay is Complete?
//true
```

- 总结

真正项目中，工厂模式配合单例，组合等多种模式完成工作。