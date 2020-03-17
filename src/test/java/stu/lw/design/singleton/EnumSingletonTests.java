package stu.lw.design.singleton;

import com.alibaba.fastjson.JSONObject;
import stu.lw.design.vo.ObjectBean;

/**
 * @Description enum singleton test
 * @Author xy
 * @Date 2020/3/17 11:17
 * @Version 1.0
 * @Since JDK 1.8
 */
public class EnumSingletonTests {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.getInstance();
        ObjectBean bean = new ObjectBean();
        bean.setDepart("pay");
        bean.setName("xyb");
        singleton.setObj(bean);
        System.out.println(JSONObject.toJSONString(bean));
        EnumSingleton singleton1 = EnumSingleton.getInstance();
        ObjectBean bean2 = new ObjectBean();
        bean2.setDepart("health");
        bean2.setName("fb");
        singleton.setObj(bean2);
        System.out.println(JSONObject.toJSONString(bean2));

        System.out.println(JSONObject.toJSONString(singleton.getObj()));

        System.out.println(singleton.getObj() == singleton1.getObj());
    }
}
