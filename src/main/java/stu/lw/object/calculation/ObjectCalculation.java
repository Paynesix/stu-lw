package stu.lw.object.calculation;

import org.apache.lucene.util.RamUsageEstimator;

/**
 * @Description object calculation
 * @Author xy
 * @Date 2020/3/19 11:39
 * @Version 1.0
 * @Since JDK 1.8
 */
public class ObjectCalculation {

    //计算指定对象及其引用树上的所有对象的综合大小，单位字节
    public long sizeOfObject(Object obj){
        return RamUsageEstimator.sizeOf(obj);
    }
    //计算指定对象本身在堆空间的大小，单位字节
    public long shallowSizeofObject(Object obj){
        return RamUsageEstimator.shallowSizeOf(obj);
    }
    //计算指定对象及其引用树上的所有对象的综合大小，返回可读的结果，如：2KB
    public String humanSizeOfObject(Object obj){
        return RamUsageEstimator.humanSizeOf(obj);
    }
}
