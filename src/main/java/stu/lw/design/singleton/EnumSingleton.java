package stu.lw.design.singleton;

/**
 * @Description enum singleton
 * @Author xy
 * @Date 2020/3/17 11:15
 * @Version 1.0
 * @Since JDK 1.8
 */
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
