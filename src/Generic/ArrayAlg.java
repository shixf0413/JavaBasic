package Generic;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 限定类型变量
 */
public class ArrayAlg {

/*    public static <T> T min(T a, T b){
        if(a.comapareTo(b) > 0) return a;else b;
    }*/

    /**
     * @param a
     * @param b
     * @param <T> T必须为Comparable的派生类，或者实现接口, 但是类只可以有一个，因为Java单继承
     *           extends 左右俩边可以有多个参数
     * @return
     */
    public static <T extends ArrayList & Comparable & Serializable> T min(T a, T b){
        if (a.compareTo (b) > 0)return b;else return a;
    }

    public static void main(String[] args) {
//        Integer min = min(2, 1);
//        System.out.println(min);
    }

    /**
     *  泛型方法和泛型类都可以限定类型参数变量
     * @param <T>
     */
    static class ClassBorder<T extends ArrayList & Comparable>{

    }
}
