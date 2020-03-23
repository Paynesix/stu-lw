package stu.lw.design.factory;

/**
 * @Description WorkFactory
 * @Author xy
 * @Date 2020/3/23 16:06
 * @Version 1.0
 * @Since JDK 1.8
 */
public class WorkFactory extends AbstractFactory {
    @Override
    public Product getProductFactory(String require) {
        return null;
    }

    @Override
    public Work getWorkFactory(String work) {
        if(work == null){
            return null;
        }
        Work workPro;
        if ("program".equals(work)) {
            workPro = new ProgramWork();
        }else if("product".equals(work)){
            workPro = new ProductWork();
        }else {
            workPro = null;
        }
        return workPro;
    }
}
