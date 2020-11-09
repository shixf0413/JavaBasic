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

    public static void main(String[] args) {
        /**
         * 3.基础类型不可以作为泛型的"参数化类型"的，必须用他们的包装类
         * @param args
         */
        //Restrict<double> restrict
        Restrict<Double> restrict = new Restrict<>();
        Restrict<String> restrictStr = new Restrict<>();

        /**
         * 4.泛型中不可以使用instanceof
         */
        //if(restrict instanceof Restrict<Double>);

        /**
         * 5.println "true"
         */
        System.out.println(restrict.getClass() ==
                restrictStr.getClass());


        /**
         * 6.
         */
        Restrict<Double>[] restrictArray;
        Restrict<Double>[] restrictArray2 = new Restrict[10];
        //Restrict<Double>[] restrictArray3 = new Restrict<Double>[10];
    }

    /**
     * 7.泛型类不可以派生自(extends) Exception/Throwable
     * 不能捕获泛型类对象 catch(T t)
     */
    private class ExceptionRestrict /*extends Exception*/{
/*        public <T extends Throwable> void doWork(T t){
            try {

            }catch (T t){

            }
        }*/
        public <T extends Throwable> void doWorkSuccess(T x)throws T{
            try {

            }catch (Throwable e){
                throw x;//
            }
        }
    }
}
