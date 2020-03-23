package stu.lw.object.calculation;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 测试对像的内存大小
 * @Author xy
 * @Date 2020/3/19 14:27
 * @Version 1.0
 * @Since JDK 1.8
 */
public class ObjectCalculationTests {

    public static void main(String[] args) {

        String[] orderField = {"pay_order_id", "biz_order_id", "his_id", "his_name", "biz_channel", "biz_type", "pay_mode", "pay_channel", "pay_method", "channel_user_id",
                "user_id", "goods_name", "total_fee", "fee", "medicare_fee", "discount_fee", "real_total_fee", "effective_length", "status", "pay_serial_no", "inside_merchant_id",
                "merchant_id", "merchant_order_id", "pre_pay_no", "payed_time", "acquirer_serial_no", "bank", "bank_serial", "biz_content", "is_med_pay", "notice_biz_flag",
                "ext_fields", "revoke_time", "create_time", "update_time"};
        String[] orderValue = {"1000000000000000001", "1000000000000000000", "50000", "测试统计数据用门店1", "1", "current_register", "weixin_wap", "weixin", "wap",
                "o5Jx4v7zgsQx3V3zKGRa-fgHRHbE", "1800000009644", "望城区人民医院-当班挂号", "700", "700", "0", "0", "700", "895", "S", "34280660221200001", "2212001",
                "1345113301", "34280660221200001", "wx011002503468186377dfe6941855340729", "2019-03-14 10:02:54", "4200000209201811010378011389", "CMB_DEBIT", "",
                "[{\"key\":\"费用类型\",\"value\":\"当班挂号\"},{\"key\":\"就诊科室\",\"value\":\"门诊儿科急诊\"},{\"key\":\"医生名称\",\"value\":\"普通号\"},{\"key\":\"就诊日期\",\"value\":\"2018-11-01 星期四\"},{\"key\":\"就诊时段\",\"value\":\"全天\"},{\"key\":\"就诊人\",\"value\":\"陈伟\"},{\"key\":\"就诊卡号\",\"value\":\"000022983\"}]",
                "0", "1", "", "", "2019-03-14 10:02:24", "2019-03-15 18:12:12"};
        JSONObject object = new JSONObject();
        for (int i = 0; i < orderField.length; i++) {
            object.put(orderField[i], orderValue[i]);
        }
        TradeOrder order = JSONObject.toJavaObject(object, TradeOrder.class);
        ObjectCalculation checkBeanSize = new ObjectCalculation();
        System.out.println("list size:1, list sizeOfObject:" + checkBeanSize.sizeOfObject(order));
        System.out.println("list size:1, list shallowSizeofObject:" + checkBeanSize.shallowSizeofObject(order));
        System.out.println("list size:1, list humanSizeOfObject:" + checkBeanSize.humanSizeOfObject(order));
        List<TradeOrder> list = new ArrayList<>();
        try {
            for (int j = 0; j < 5; j++) {
                TradeOrder temp = new TradeOrder();
                BeanUtils.copyProperties(temp, order);
                list.add(temp);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("list size:" + list.size() + ", list sizeOfObject:" + checkBeanSize.sizeOfObject(list));
        System.out.println("list size:" + list.size() + ", list shallowSizeofObject:" + checkBeanSize.shallowSizeofObject(list));
        System.out.println("list size:" + list.size() + ", list humanSizeOfObject:" + checkBeanSize.humanSizeOfObject(list));
//
//        ObjectBean bean = new ObjectBean();
//        bean.setName("xy");
//        bean.setDepart("pay");
//        JSONObject json = new JSONObject();
//        json.put("name", "xy");
//        json.put("depart", "pay");
//        ObjectCalculation calculation = new ObjectCalculation();
//        System.out.println(calculation.humanSizeOfObject(bean));
//        System.out.println(calculation.humanSizeOfObject(json));
//
//        System.out.println(calculation.shallowSizeofObject(bean));
//        System.out.println(calculation.shallowSizeofObject(json));
//
//        System.out.println(calculation.sizeOfObject(bean));
//        System.out.println(calculation.sizeOfObject(json));
    }
}
