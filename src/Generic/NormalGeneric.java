package Generic;

public class NormalGeneric<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NormalGeneric(T data) {
        this.data = data;
    }

    public NormalGeneric() {
    }

    public <T,E> T show(NormalGeneric<E> generic){
        return null;
    }

    public static void main(String[] args) {
        NormalGeneric<String> normalGeneric = new NormalGeneric<>();
        normalGeneric.setData("Ok");
        System.out.println(normalGeneric.getData());
    }
}
