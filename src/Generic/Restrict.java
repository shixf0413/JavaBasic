package Generic;

/**
 * 泛型中的约束和局限性
 */
public class Restrict<T> {

    private T data;

    /**
     * 1.不能实例化类型变量
     */
    public Restrict(){
//        this.data = new T();
    }

    /**
     * 2.静态(变量)域或者方法里不能引用类型变量
     * 如果是静态的泛型方法是可以的
     *
     *  因为 只有在创建出来对象时，才知道对象的类型，
     *  创建对象时，一定是先执行static资源的,再执行构造方法
     */
//    private static T instance;

    public static <T> T getInstance(){
        return null;
    }

    /**
     * 基础类型不可以作为泛型的"参数化类型"的，必须用他们的包装类
     * @param args
     */
    public static void main(String[] args) {
    }

}
