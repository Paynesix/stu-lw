package stu.lw.design.factory;

/**
 * @Description programmer
 * @Author xy
 * @Date 2020/3/23 15:59
 * @Version 1.0
 * @Since JDK 1.8
 */
public class ProgramWork implements Work {

    @Override
    public void workDoing() {
        System.out.println("There is programmer! They are Good!");
    }
}
