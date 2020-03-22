
## 单例模式
- 场景  
某个实例对象在全局中最多能存在一个
- 优点  
节省内存空间，保证对象唯一性
- 缺点  
不使用的情况下占用内存空间
- 类图  

- 实例  
实现方式有如下几种：  
1.饿汉式单例:容易一开始就加载到内存，可能导致加载压力。 线程安全  
```java
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
```
2.懒汉式单例:延迟加载， 线程不安全  
```java
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
```
3.双重检查单例:延迟加载，线程安全。但加锁可导致多线程竞争而加载慢  
```java
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                    return singleton;
                }
            }
        }
        return singleton;
    }
}
```
4.静态内部类单例:延迟加载，线程安全。
```javva
public class StaticClassSingleton {

    private StaticClassSingleton() {}

    public static StaticClassSingleton getInstance() {
        return SingleTonHolder.INSTANCE;
    }

    private static class SingleTonHolder {
        private static StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }
}
```  
5.枚举单例:线程安全。
```java
public enum EnumSingleton {
    INSTANCE;
    private Object obj;//根据需求，可以组合各种对象
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
```  


- 总结  
单例模式有多种方式，目的是确保在上下文中只有一个实例存在，可以根据需求选择不同的实现。