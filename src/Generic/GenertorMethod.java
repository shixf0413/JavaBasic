package Generic;

/**
 * 泛型方法
 */
public class GenertorMethod {

    /**
     *  泛型方法是独立的，没必要声明在泛型类和泛型方法中
     *
     * @param a
     * @param <T>
     * @return
     */
    public <T> T genericMethod(T...a){
        return a[a.length/2];
    }

    /**
     *
     * @param str 在定义方法的时候，只需将最后一个形参后加上"…",就可以表示该形参可以接收多个参数值，多个参数值被当成数组传入
     * @return
     */
    public String demo_1(String...str){
        for (String s : str) {
            if(s == "ok"){
                return s;
            }
        }
        return null;
    }

    public void dmeo(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        GenertorMethod g = new GenertorMethod();
//        g.dmeo(1,1);

        System.out.println(g.genericMethod(10));

        System.out.println(g.genericMethod(2, "dd","ok"));

        System.out.println(g.demo_1("this", "is", "ok"));

    }
}
