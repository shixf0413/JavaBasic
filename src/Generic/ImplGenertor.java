package Generic;

/**
 * 泛型类
 * @param <T> T 称 (类型参数变量/参数化类型)
 * 且泛型类中的 参数化类型 只影响普通方法的参数化类型，
 * 泛型方法中的参数化类型 不受泛型类的参数化类型影响
 *
 */
public class ImplGenertor<T> implements Genertor<T> {
    @Override
    public T next() {
        return null;
    }
}

/**
 * Integer称 实际类型参数
 */
class ImplGenertor2 implements Genertor<Integer>{

    @Override
    public Integer next() {
        return null;
    }
}

